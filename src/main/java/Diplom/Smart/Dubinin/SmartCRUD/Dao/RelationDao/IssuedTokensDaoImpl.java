package Diplom.Smart.Dubinin.SmartCRUD.Dao.RelationDao;

import Diplom.Smart.Dubinin.SmartCRUD.model.RelationModel.IssuedTokens;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository("IssuedTokensDaoImpl")
public class IssuedTokensDaoImpl implements IssuedTokensDao {


    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void add(IssuedTokens issuedToken) {
        entityManager.persist(issuedToken);
    }

    @Override
    public void delete(long id) {
        IssuedTokens issuedToken = getById(id);
        entityManager.remove(issuedToken);
    }

    @Override
    public void edit(IssuedTokens issuedToken) {
        entityManager.merge(issuedToken);
    }

    @Override
    public IssuedTokens getById(long id) {
        return entityManager.find(IssuedTokens.class, id);
    }

    @Override
    public List<IssuedTokens> getListAuthorities() {
        return null;
    }
}
