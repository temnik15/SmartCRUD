package Diplom.Smart.Dubinin.SmartCRUD.Dao.RelationDao;

import Diplom.Smart.Dubinin.SmartCRUD.model.RelationModel.LogsClass;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository("LogsClassDaoImpl")
public class LogsClassDaoImpl implements LogsClassDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void add(LogsClass logsClass) {
        entityManager.persist(logsClass);
    }

    @Override
    public void delete(long id) {
        LogsClass logsClass = getById(id);
        entityManager.remove(logsClass);

    }

    @Override
    public void edit(LogsClass logsClass) {
        entityManager.persist(logsClass);
    }

    @Override
    public LogsClass getById(long id) {
        return entityManager.find(LogsClass.class, id);
    }

    @Override
    public List<LogsClass> getList() {
        return entityManager.createQuery("SELECT logsClass FROM LogsClass logsClass").getResultList();
    }
}
