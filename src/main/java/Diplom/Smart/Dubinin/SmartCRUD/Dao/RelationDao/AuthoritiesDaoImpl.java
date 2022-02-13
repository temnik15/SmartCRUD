package Diplom.Smart.Dubinin.SmartCRUD.Dao.RelationDao;

import Diplom.Smart.Dubinin.SmartCRUD.model.RelationModel.Authorities;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository("AuthoritiesDaoImpl")
public class AuthoritiesDaoImpl implements AuthoritiesDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void add(Authorities authority) {
        entityManager.persist(authority);

    }

    @Override
    public void delete(long id) {
        Authorities authority = getById(id);
        entityManager.remove(authority);
    }

    @Override
    public void edit(Authorities authority) {
        entityManager.merge(authority);
    }

    @Override
    public Authorities getById(long id) {
        return entityManager.find(Authorities.class, id);
    }

    @Override
    public List<Authorities> getList() {
        return entityManager.createQuery("SELECT authorities FROM Authorities authorities").getResultList();

    }
}
