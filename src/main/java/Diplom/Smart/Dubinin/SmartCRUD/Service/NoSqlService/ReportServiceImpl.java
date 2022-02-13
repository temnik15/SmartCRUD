package Diplom.Smart.Dubinin.SmartCRUD.Service.NoSqlService;

import Diplom.Smart.Dubinin.SmartCRUD.Dao.NoSqlDao.ReportDao;
import Diplom.Smart.Dubinin.SmartCRUD.model.NoSqlModel.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ReportServiceImpl")
public class ReportServiceImpl implements ReportService {

    @Autowired
    @Qualifier("ReportDao")
    ReportDao dao;


    @Override
    public void add(Report report) {
        dao.save(report);
    }

    @Override
    public void delete(long id) {
        dao.delete(getById(id));
    }

    @Override
    public void edit(Report report) {
        dao.insert(report);
    }

    @Override
    public List<Report> getList() {
        return dao.findAll();
    }

    @Override
    public Report getById(long id) {
        return dao.findById(id).get();
    }
}
