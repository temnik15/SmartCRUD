package Diplom.Smart.Dubinin.SmartCRUD.Dao.RelationDao;

import Diplom.Smart.Dubinin.SmartCRUD.model.RelationModel.User;

import java.util.List;

public interface UserDao {
    void add(User user);

    void delete(long id);

    void edit(User user);

    User getById(long id);

    User getByMail(String name);

    List<User> getList();
}
