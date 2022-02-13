package Diplom.Smart.Dubinin.SmartCRUD.Service.RelationService;

import Diplom.Smart.Dubinin.SmartCRUD.Dao.RelationDao.AuthoritiesDao;
import Diplom.Smart.Dubinin.SmartCRUD.model.RelationModel.Authorities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("AuthoritiesServiceImpl")
public class AuthoritiesServiceImpl implements AuthoritiesService {

    @Autowired
    @Qualifier("AuthoritiesDaoImpl")
    AuthoritiesDao authoritiesDao;

    @Override
    @Transactional
    public void add(Authorities authority) {
        authoritiesDao.add(authority);

    }

    @Override
    @Transactional
    public void delete(long id) {
        authoritiesDao.delete(id);
    }

    @Override
    @Transactional
    public void edit(Authorities authority) {
        authoritiesDao.edit(authority);
    }

    @Override
    @Transactional
    public Authorities getById(long id) {
        return authoritiesDao.getById(id);
    }

    @Override
    @Transactional
    public List<Authorities> getList() {
        return authoritiesDao.getList();
    }
}
