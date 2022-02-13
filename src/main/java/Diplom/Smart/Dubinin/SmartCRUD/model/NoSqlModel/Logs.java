package Diplom.Smart.Dubinin.SmartCRUD.model.NoSqlModel;

import Diplom.Smart.Dubinin.SmartCRUD.model.RelationModel.LogsClass;
import Diplom.Smart.Dubinin.SmartCRUD.model.RelationModel.User;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;
import java.util.Date;

@Document
public class Logs {

    @Id
    private Long id;

    @Field
    private LogsClass logsClass;

    @Field
    private String message;

    @Field
    private User user;

    @Field
    private Date date;

    public Logs(Long id, LogsClass logsClass, String message, Date date) {
        this.id = id;
        this.logsClass = logsClass;
        this.message = message;
        this.date = date;
    }

    private Logs() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LogsClass getLogsClass() {
        return logsClass;
    }

    public void setLogsClass(LogsClass logsClass) {
        this.logsClass = logsClass;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
