package Diplom.Smart.Dubinin.SmartCRUD.Service.RelationService;

import Diplom.Smart.Dubinin.SmartCRUD.model.RelationModel.SmartContracts;

import java.util.List;


public interface SmartContractsService {

    void add(SmartContracts smartContracts);

    void delete(long id);

    void edit(SmartContracts smartContracts);

    SmartContracts getById(long id);

//    Authorities getByName(String name);

    List<SmartContracts> getList();
}
