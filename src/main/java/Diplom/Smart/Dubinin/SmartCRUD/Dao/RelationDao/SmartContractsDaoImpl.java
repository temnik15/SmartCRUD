package Diplom.Smart.Dubinin.SmartCRUD.Dao.RelationDao;

import Diplom.Smart.Dubinin.SmartCRUD.model.RelationModel.SmartContracts;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository("SmartContractsDaoImpl")
public class SmartContractsDaoImpl implements SmartContractsDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void add(SmartContracts smartContracts) {
        entityManager.persist(smartContracts);
    }

    @Override
    public void delete(long id) {
        SmartContracts smartContracts = getById(id);
        entityManager.remove(smartContracts);
    }

    @Override
    public void edit(SmartContracts smartContracts) {
        entityManager.persist(smartContracts);
    }

    @Override
    public SmartContracts getById(long id) {
        return entityManager.find(SmartContracts.class, id);
    }

    @Override
    public List<SmartContracts> getList() {
        System.out.println(1);
        System.out.println(entityManager.createQuery("SELECT smartContracts FROM SmartContracts smartContracts").getResultList());
        return entityManager.createQuery("SELECT smartContracts FROM SmartContracts smartContracts").getResultList();
    }
}
