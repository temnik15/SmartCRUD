package Diplom.Smart.Dubinin.SmartCRUD.Dao.RelationDao;

import Diplom.Smart.Dubinin.SmartCRUD.model.RelationModel.Role;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository("RoleDaoImpl")
public class RoleDaoImpl implements RoleDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void add(Role role) {
        entityManager.persist(role);
    }

    @Override
    public void delete(long id) {
        Role role = getById(id);
        entityManager.remove(role);
    }

    @Override
    public void edit(Role role) {
        entityManager.persist(role);
    }

    @Override
    public Role getById(long id) {
        return entityManager.find(Role.class, id);
    }

    @Override
    public List<Role> getList() {
        return entityManager.createQuery("SELECT role FROM Role role").getResultList();

    }
}
