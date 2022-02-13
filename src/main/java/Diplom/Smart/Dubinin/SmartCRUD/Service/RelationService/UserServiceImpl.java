
package Diplom.Smart.Dubinin.SmartCRUD.Service.RelationService;

import Diplom.Smart.Dubinin.SmartCRUD.Dao.RelationDao.UserDao;

import Diplom.Smart.Dubinin.SmartCRUD.model.RelationModel.Role;
import Diplom.Smart.Dubinin.SmartCRUD.model.RelationModel.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service("UserServiceImpl")
public class UserServiceImpl implements UserService {

    UserServiceImpl() {
    }

    @Qualifier("UserDaoImpl")
    @Autowired
    UserDao userDao;

    @Transactional
    public void add(User user) {
        userDao.add(user);
    }

    @Transactional
    public void delete(long id) {
        userDao.delete(id);
    }

    @Transactional
    public void edit(User user) {
        userDao.edit(user);
    }

    @Transactional
    public User getById(long id) {
        return userDao.getById(id);
    }

    @Transactional
    public List<User> getList() {
        return userDao.getList();
    }

    @Transactional
    public User getByMail(String name) {
        return userDao.getByMail(name);
    }

    private Collection<? extends GrantedAuthority> collectionRoles(Collection<Role> roles) {
        return roles.stream().map(r -> new SimpleGrantedAuthority(r.getName())).collect(Collectors.toList());
    }


    @Override
    @Transactional
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userDao.getByMail(s);
        if (user == null) {
            throw new UsernameNotFoundException("User not found " + s);
        }
        user.setAuthorities(collectionRoles(user.getRole()));
        return user;
    }
}
