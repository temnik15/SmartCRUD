package Diplom.Smart.Dubinin.SmartCRUD.Service.NoSqlService;


import Diplom.Smart.Dubinin.SmartCRUD.model.NoSqlModel.Logs;

import java.util.List;

public interface LogsService {

    void add(Logs logs);

    void delete(long id);

    void edit(Logs logs);

    Logs getById(long id);


    List<Logs> getList();
}
