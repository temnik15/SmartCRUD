package Diplom.Smart.Dubinin.SmartCRUD.Service.RelationService;

import Diplom.Smart.Dubinin.SmartCRUD.model.RelationModel.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    void add(User user);

    void delete(long id);

    void edit(User user);

    User getById(long id);

    User getByMail(String name);

    List<User> getList();
}
