package Diplom.Smart.Dubinin.SmartCRUD.Dao.NoSqlDao;

import Diplom.Smart.Dubinin.SmartCRUD.model.NoSqlModel.Report;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository("ReportDao")
public interface ReportDao extends MongoRepository<Report, Long> {
}
