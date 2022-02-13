package Diplom.Smart.Dubinin.SmartCRUD.Service.NoSqlService;

import Diplom.Smart.Dubinin.SmartCRUD.Dao.NoSqlDao.TemplateSmartContractDao;
import Diplom.Smart.Dubinin.SmartCRUD.model.NoSqlModel.TemplateSmartContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("TemplateSmartContractServiceImpl")
public class TemplateSmartContractServiceImpl implements TemplateSmartContractService {

    @Autowired
    @Qualifier("TemplateSmartContractDao")
    TemplateSmartContractDao dao;

    @Transactional
    public void add(TemplateSmartContract templateSmartContract) {
        dao.save(templateSmartContract);
    }

    @Override
    public void delete(long id) {
        dao.delete(getById(id));
    }

    @Override
    public void edit(TemplateSmartContract templateSmartContract) {
        dao.insert(templateSmartContract);
    }

    @Override
    public TemplateSmartContract getById(long id) {
        return dao.findById(id).get();
    }

    @Override
    public List<TemplateSmartContract> getList() {
        return dao.findAll();
    }
}
