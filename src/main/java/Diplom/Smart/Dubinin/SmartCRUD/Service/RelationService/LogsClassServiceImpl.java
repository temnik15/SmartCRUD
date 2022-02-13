package Diplom.Smart.Dubinin.SmartCRUD.Service.RelationService;

import Diplom.Smart.Dubinin.SmartCRUD.Dao.RelationDao.LogsClassDao;
import Diplom.Smart.Dubinin.SmartCRUD.model.RelationModel.LogsClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("LogsClassServiceImpl")
public class LogsClassServiceImpl implements LogsClassService {

    @Autowired
    @Qualifier("LogsClassDaoImpl")
    LogsClassDao logsClassDao;


    @Override
    @Transactional
    public void add(LogsClass logsClass) {
        logsClassDao.add(logsClass);
    }

    @Override
    @Transactional
    public void delete(long id) {
        logsClassDao.delete(id);
    }

    @Override
    @Transactional
    public void edit(LogsClass logsClass) {
        logsClassDao.edit(logsClass);
    }

    @Override
    @Transactional
    public LogsClass getById(long id) {
        return logsClassDao.getById(id);
    }

    @Override
    @Transactional
    public List<LogsClass> getList() {
        return logsClassDao.getList();
    }
}
