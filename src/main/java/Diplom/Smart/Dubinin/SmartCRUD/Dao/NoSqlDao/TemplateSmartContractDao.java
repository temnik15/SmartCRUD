package Diplom.Smart.Dubinin.SmartCRUD.Dao.NoSqlDao;

import Diplom.Smart.Dubinin.SmartCRUD.model.NoSqlModel.TemplateSmartContract;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository("TemplateSmartContractDao")
public interface TemplateSmartContractDao extends MongoRepository<TemplateSmartContract, Long> {

    public Optional<TemplateSmartContract> findById(Long id);
}
