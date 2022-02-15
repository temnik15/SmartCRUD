package Diplom.Smart.Dubinin.SmartCRUD.Service.RelationService;

import Diplom.Smart.Dubinin.SmartCRUD.Dao.RelationDao.RoleDao;
import Diplom.Smart.Dubinin.SmartCRUD.model.RelationModel.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("RoleServiceImpl")
public class RoleServiceImpl implements RoleService {

    @Autowired
    @Qualifier("RoleDaoImpl")
    RoleDao roleDao;

    @Override
    @Transactional
    public void add(Role role) {
        roleDao.add(role);
    }

    @Override
    @Transactional
    public void delete(long id) {
        roleDao.delete(id);
    }

    @Override
    @Transactional
    public void edit(Role role) {
        roleDao.edit(role);
    }

    @Override
    @Transactional
    public Role getById(long id) {
        return roleDao.getById(id);
    }

    @Override
    @Transactional
    public List<Role> getList() {
        return roleDao.getList();
    }

    @Override
    public Role getByName(String name) {
        return roleDao.getByName(name);
    }
}
