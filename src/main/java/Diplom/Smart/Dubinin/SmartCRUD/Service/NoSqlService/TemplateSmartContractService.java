package Diplom.Smart.Dubinin.SmartCRUD.Service.NoSqlService;

import Diplom.Smart.Dubinin.SmartCRUD.model.NoSqlModel.Report;
import Diplom.Smart.Dubinin.SmartCRUD.model.NoSqlModel.TemplateSmartContract;

import java.util.List;

public interface TemplateSmartContractService {
    void add(TemplateSmartContract templateSmartContract);

    void delete(long id);

    void edit(TemplateSmartContract templateSmartContract);

    List<TemplateSmartContract> getList();

    TemplateSmartContract getById(long id);
}
