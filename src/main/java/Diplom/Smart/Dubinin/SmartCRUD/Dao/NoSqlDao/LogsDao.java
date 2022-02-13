package Diplom.Smart.Dubinin.SmartCRUD.Dao.NoSqlDao;

import Diplom.Smart.Dubinin.SmartCRUD.model.NoSqlModel.Logs;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository("LogsDao")
public interface LogsDao extends MongoRepository<Logs, Long> {
}
