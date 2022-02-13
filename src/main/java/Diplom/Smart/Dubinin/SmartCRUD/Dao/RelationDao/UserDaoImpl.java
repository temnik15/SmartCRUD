package Diplom.Smart.Dubinin.SmartCRUD.Dao.RelationDao;

import Diplom.Smart.Dubinin.SmartCRUD.model.RelationModel.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository("UserDaoImpl")
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void add(User user) {
        entityManager.persist(user);
    }

    @Override
    public void delete(long id) {
        User user = getById(id);
        entityManager.remove(user);
    }

    @Override
    public void edit(User user) {
        entityManager.merge(user);
    }

    @Override
    public User getById(long id) {
        return entityManager.find(User.class, id);
    }


    @Override
    @SuppressWarnings("unchecked")
    public List<User> getList() {
        return entityManager.createQuery("SELECT user FROM User user").getResultList();
    }


    @Override
    public User getByMail(String login) {
        TypedQuery<User> query = entityManager.createQuery(
                        "select user from User user " +
                                "where user.login =: login",
                        User.class)
                .setParameter("login", login);
        return query.getSingleResult();
    }


    public boolean existsByUsername(String username) {
        return getByMail(username).getUsername().equals(username);
    }

}
