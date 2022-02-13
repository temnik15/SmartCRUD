package Diplom.Smart.Dubinin.SmartCRUD.Dao.RelationDao;


import Diplom.Smart.Dubinin.SmartCRUD.model.RelationModel.IssuedTokens;

import java.util.List;

public interface IssuedTokensDao {
    void add(IssuedTokens issuedToken);

    void delete(long id);

    void edit(IssuedTokens issuedToken);

    IssuedTokens getById(long id);

//    Authorities getByName(String name);

    List<IssuedTokens> getListAuthorities();
}
