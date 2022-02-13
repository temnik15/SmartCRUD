package Diplom.Smart.Dubinin.SmartCRUD.model.NoSqlModel;


import Diplom.Smart.Dubinin.SmartCRUD.model.RelationModel.User;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;

@Document
public class Report {


    @Id
    private Long id;

    @Field
    private User user;

    @Field
    private String message;

    public Report(Long id, User user, String message) {
        this.id = id;
        this.user = user;
        this.message = message;
    }

    public Report() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
