package Diplom.Smart.Dubinin.SmartCRUD.Dao.RelationDao;

import Diplom.Smart.Dubinin.SmartCRUD.model.RelationModel.EDOsUser;

import java.util.List;

public interface EDOsUserDao {

    void add(EDOsUser edOsUser);

    void delete(long id);

    void edit(EDOsUser edOsUser);

    EDOsUser getById(long id);

//    Authorities getByName(String name);

    List<EDOsUser> getList();
}
