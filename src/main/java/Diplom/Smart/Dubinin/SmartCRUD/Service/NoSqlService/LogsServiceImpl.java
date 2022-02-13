package Diplom.Smart.Dubinin.SmartCRUD.Service.NoSqlService;

import Diplom.Smart.Dubinin.SmartCRUD.Dao.NoSqlDao.LogsDao;
import Diplom.Smart.Dubinin.SmartCRUD.model.NoSqlModel.Logs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("LogsServiceImpl")
public class LogsServiceImpl implements LogsService {

    @Autowired
    @Qualifier("LogsDao")
    LogsDao dao;


    @Override
    public void add(Logs logs) {
        dao.save(logs);
    }

    @Override
    public void delete(long id) {
        dao.delete(getById(id));
    }

    @Override
    public void edit(Logs logs) {
        dao.insert(logs);
    }

    @Override
    public Logs getById(long id) {
        return dao.findById(id).get();
    }

    @Override
    public List<Logs> getList() {
        return dao.findAll();
    }
}
