package Diplom.Smart.Dubinin.SmartCRUD.Dao.RelationDao;


import Diplom.Smart.Dubinin.SmartCRUD.model.RelationModel.LogsClass;

import java.util.List;

public interface LogsClassDao {

    void add(LogsClass logsClass);

    void delete(long id);

    void edit(LogsClass logsClass);

    LogsClass getById(long id);

//    Authorities getByName(String name);

    List<LogsClass> getList();
}
