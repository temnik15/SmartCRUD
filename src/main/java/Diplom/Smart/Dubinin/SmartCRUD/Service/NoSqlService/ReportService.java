package Diplom.Smart.Dubinin.SmartCRUD.Service.NoSqlService;


import Diplom.Smart.Dubinin.SmartCRUD.Dao.NoSqlDao.LogsDao;
import Diplom.Smart.Dubinin.SmartCRUD.Dao.NoSqlDao.ReportDao;
import Diplom.Smart.Dubinin.SmartCRUD.model.NoSqlModel.Logs;
import Diplom.Smart.Dubinin.SmartCRUD.model.NoSqlModel.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public interface ReportService {


    void add(Report report);

    void delete(long id);

    void edit(Report report);

    List<Report> getList();

    Report getById(long id);
}
