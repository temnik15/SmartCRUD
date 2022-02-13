package Diplom.Smart.Dubinin.SmartCRUD.Service.RelationService;


import Diplom.Smart.Dubinin.SmartCRUD.model.RelationModel.Role;

import java.util.List;

public interface RoleService {
    void add(Role role);

    void delete(long id);

    void edit(Role role);

    Role getById(long id);

//    Authorities getByName(String name);

    List<Role> getList();
}
