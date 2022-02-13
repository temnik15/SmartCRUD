package Diplom.Smart.Dubinin.SmartCRUD.Service.NoSqlService;

import Diplom.Smart.Dubinin.SmartCRUD.model.NoSqlModel.Documentation;
import Diplom.Smart.Dubinin.SmartCRUD.model.RelationModel.Authorities;

import java.util.List;

public interface DocumentationService {

    void add(Documentation documentation);

    void delete(long id);

    void edit(Documentation documentation);

    Documentation getById(long id);

    List<Documentation> getList();

//    Authorities getByName(String name);


}
