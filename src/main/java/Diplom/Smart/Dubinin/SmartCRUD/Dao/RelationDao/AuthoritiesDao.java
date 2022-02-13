package Diplom.Smart.Dubinin.SmartCRUD.Dao.RelationDao;

import Diplom.Smart.Dubinin.SmartCRUD.model.RelationModel.Authorities;

import java.util.List;

public interface AuthoritiesDao {

    void add(Authorities authorities);

    void delete(long id);

    void edit(Authorities authorities);

    Authorities getById(long id);

//    Authorities getByName(String name);

    List<Authorities> getList();
}
