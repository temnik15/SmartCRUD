package Diplom.Smart.Dubinin.SmartCRUD.Service.RelationService;

import Diplom.Smart.Dubinin.SmartCRUD.Dao.RelationDao.StatusSmartContractDao;
import Diplom.Smart.Dubinin.SmartCRUD.model.RelationModel.StatusSmartContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("StatusSmartContractServiceImpl")
public class StatusSmartContractServiceImpl implements StatusSmartContractService {

    @Autowired
    @Qualifier("StatusSmartContractDaoImpl")
    StatusSmartContractDao statusSmartContractsDao;

    @Override
    @Transactional
    public void add(StatusSmartContract statusSmartContract) {
        statusSmartContractsDao.add(statusSmartContract);
    }

    @Override
    @Transactional
    public void delete(long id) {
        statusSmartContractsDao.delete(id);
    }

    @Override
    @Transactional
    public void edit(StatusSmartContract statusSmartContract) {
        statusSmartContractsDao.edit(statusSmartContract);
    }

    @Override
    @Transactional
    public StatusSmartContract getById(long id) {
        return statusSmartContractsDao.getById(id);
    }

    @Override
    @Transactional
    public List<StatusSmartContract> getList() {
        return statusSmartContractsDao.getList();
    }
}
