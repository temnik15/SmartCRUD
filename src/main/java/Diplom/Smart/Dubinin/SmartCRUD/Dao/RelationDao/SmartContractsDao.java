package Diplom.Smart.Dubinin.SmartCRUD.Dao.RelationDao;

import Diplom.Smart.Dubinin.SmartCRUD.model.RelationModel.SmartContracts;

import java.util.List;


public interface SmartContractsDao {

    void add(SmartContracts smartContracts);

    void delete(long id);

    void edit(SmartContracts smartContracts);

    SmartContracts getById(long id);

//    Authorities getByName(String name);

    List<SmartContracts> getList();
}
