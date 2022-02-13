package Diplom.Smart.Dubinin.SmartCRUD.Dao.RelationDao;

import Diplom.Smart.Dubinin.SmartCRUD.model.RelationModel.StatusSmartContract;

import java.util.List;

public interface StatusSmartContractDao {

    void add(StatusSmartContract statusSmartContract);

    void delete(long id);

    void edit(StatusSmartContract statusSmartContract);

    StatusSmartContract getById(long id);

//    Authorities getByName(String name);

    List<StatusSmartContract> getList();
}
