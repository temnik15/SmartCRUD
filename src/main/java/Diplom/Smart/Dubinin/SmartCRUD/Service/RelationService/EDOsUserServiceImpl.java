package Diplom.Smart.Dubinin.SmartCRUD.Service.RelationService;

import Diplom.Smart.Dubinin.SmartCRUD.Dao.RelationDao.EDOsUserDao;
import Diplom.Smart.Dubinin.SmartCRUD.model.RelationModel.EDOsUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EDOsUserServiceImpl implements EDOsUserService {

    @Autowired
    @Qualifier("EDOsUserDaoImpl")
    EDOsUserDao dao;


    @Override
    @Transactional
    public void add(EDOsUser edOsUser) {
        dao.add(edOsUser);
    }

    @Override
    @Transactional
    public void delete(long id) {
        dao.delete(id);
    }

    @Override
    @Transactional
    public void edit(EDOsUser edOsUser) {
        dao.edit(edOsUser);

    }

    @Override
    @Transactional
    public EDOsUser getById(long id) {
        return dao.getById(id);
    }

    @Override
    @Transactional
    public List<EDOsUser> getList() {
        return dao.getList();
    }
}
