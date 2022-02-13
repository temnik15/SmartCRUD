package Diplom.Smart.Dubinin.SmartCRUD.Dao.RelationDao;

import Diplom.Smart.Dubinin.SmartCRUD.model.RelationModel.StatusSmartContract;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository("StatusSmartContractDaoImpl")
public class StatusSmartContractDaoImpl implements StatusSmartContractDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void add(StatusSmartContract statusSmartContract) {
        entityManager.persist(statusSmartContract);
    }

    @Override
    public void delete(long id) {
        StatusSmartContract statusSmartContract = getById(id);
        entityManager.remove(statusSmartContract);
    }

    @Override
    public void edit(StatusSmartContract statusSmartContract) {
        entityManager.persist(statusSmartContract);
    }

    @Override
    public StatusSmartContract getById(long id) {
        return entityManager.find(StatusSmartContract.class, id);
    }

    @Override
    public List<StatusSmartContract> getList() {
        return entityManager.createQuery("SELECT statusSmartContract FROM StatusSmartContract statusSmartContract").getResultList();
    }
}
