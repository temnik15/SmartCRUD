package Diplom.Smart.Dubinin.SmartCRUD.Service.RelationService;

import Diplom.Smart.Dubinin.SmartCRUD.Dao.RelationDao.SmartContractsDao;
import Diplom.Smart.Dubinin.SmartCRUD.model.RelationModel.SmartContracts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("SmartContractsServiceImpl")
public class SmartContractsServiceImpl implements SmartContractsService {

    @Autowired
    @Qualifier("SmartContractsDaoImpl")
    SmartContractsDao smartContractsDao;


    @Override
    @Transactional
    public void add(SmartContracts smartContracts) {
        smartContractsDao.add(smartContracts);
    }

    @Override
    @Transactional
    public void delete(long id) {
smartContractsDao.delete(id);
    }

    @Override
    @Transactional
    public void edit(SmartContracts smartContracts) {
        smartContractsDao.edit(smartContracts);
    }

    @Override
    @Transactional
    public SmartContracts getById(long id) {
       return smartContractsDao.getById(id);
    }

    @Override
    @Transactional
    public List<SmartContracts> getList() {
        List<SmartContracts> temp = smartContractsDao.getList();
        System.out.println(2);
        System.out.println(temp);
        return temp;
    }
}
