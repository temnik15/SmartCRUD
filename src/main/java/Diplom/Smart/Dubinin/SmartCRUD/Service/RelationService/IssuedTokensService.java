package Diplom.Smart.Dubinin.SmartCRUD.Service.RelationService;


import Diplom.Smart.Dubinin.SmartCRUD.model.RelationModel.IssuedTokens;

import java.util.List;

public interface IssuedTokensService {
    void add(IssuedTokens issuedToken);

    void delete(long id);

    void edit(IssuedTokens issuedToken);

    IssuedTokens getById(long id);

//    Authorities getByName(String name);

    List<IssuedTokens> getListAuthorities();
}
