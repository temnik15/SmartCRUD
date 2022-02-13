package Diplom.Smart.Dubinin.SmartCRUD.Service.RelationService;

import Diplom.Smart.Dubinin.SmartCRUD.model.RelationModel.EDOsUser;

import java.util.List;

public interface EDOsUserService {

    void add(EDOsUser edOsUser);

    void delete(long id);

    void edit(EDOsUser edOsUser);

    EDOsUser getById(long id);

//    Authorities getByName(String name);

    List<EDOsUser> getList();
}
