package Diplom.Smart.Dubinin.SmartCRUD.Service.RelationService;

import Diplom.Smart.Dubinin.SmartCRUD.Dao.RelationDao.IssuedTokensDao;
import Diplom.Smart.Dubinin.SmartCRUD.model.RelationModel.IssuedTokens;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class IssuedTokensServiceImpl implements IssuedTokensService {


    @Autowired
    @Qualifier("IssuedTokensDaoImpl")
    IssuedTokensDao dao;

    @Override
    @Transactional
    public void add(IssuedTokens issuedToken) {
        dao.add(issuedToken);
    }

    @Override
    @Transactional
    public void delete(long id) {
        dao.delete(id);
    }

    @Override
    @Transactional
    public void edit(IssuedTokens issuedToken) {
        dao.edit(issuedToken);
    }

    @Override
    @Transactional
    public IssuedTokens getById(long id) {
        return dao.getById(id);
    }

    @Override
    @Transactional
    public List<IssuedTokens> getListAuthorities() {
        return dao.getListAuthorities();
    }
}
