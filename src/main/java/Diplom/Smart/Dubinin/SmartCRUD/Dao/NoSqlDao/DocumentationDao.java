package Diplom.Smart.Dubinin.SmartCRUD.Dao.NoSqlDao;

import Diplom.Smart.Dubinin.SmartCRUD.model.NoSqlModel.Documentation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository("DocumentationDao")
public interface DocumentationDao extends MongoRepository<Documentation, Long> {
}
