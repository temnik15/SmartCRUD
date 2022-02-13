package Diplom.Smart.Dubinin.SmartCRUD.Service.NoSqlService;

import Diplom.Smart.Dubinin.SmartCRUD.Dao.NoSqlDao.DocumentationDao;
import Diplom.Smart.Dubinin.SmartCRUD.model.NoSqlModel.Documentation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.persistence.Access;
import java.util.List;

@Service("DocumentationServiceImpl")
public class DocumentationServiceImpl implements DocumentationService {

    @Autowired
    @Qualifier("DocumentationDao")
    DocumentationDao dao;


    @Override
    public void add(Documentation documentation) {
        dao.save(documentation);
    }

    @Override
    public void delete(long id) {
        dao.delete(getById(id));
    }

    @Override
    public void edit(Documentation documentation) {
        dao.insert(documentation);
    }

    @Override
    public Documentation getById(long id) {
        return dao.findById(id).get();
    }


    @Override
    public List<Documentation> getList() {
        return dao.findAll();
    }
}
