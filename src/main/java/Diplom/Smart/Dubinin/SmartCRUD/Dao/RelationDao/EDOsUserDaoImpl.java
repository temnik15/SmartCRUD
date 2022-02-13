package Diplom.Smart.Dubinin.SmartCRUD.Dao.RelationDao;

import Diplom.Smart.Dubinin.SmartCRUD.model.RelationModel.EDOsUser;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository("EDOsUserDaoImpl")
public class EDOsUserDaoImpl implements EDOsUserDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void add(EDOsUser edOsUser) {
        entityManager.persist(edOsUser);
    }

    @Override
    public void delete(long id) {
        EDOsUser edOsUser = getById(id);
        entityManager.remove(edOsUser);
    }

    @Override
    public void edit(EDOsUser edOsUser) {
        entityManager.merge(edOsUser);

    }

    @Override
    public EDOsUser getById(long id) {
        return entityManager.find(EDOsUser.class, id);
    }

    @Override
    public List<EDOsUser> getList() {
        return entityManager.createQuery("SELECT eDOsUser FROM EDOsUser eDOsUser").getResultList();
    }
}
