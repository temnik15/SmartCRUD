package Diplom.Smart.Dubinin.SmartCRUD.model.RelationModel;

import javax.persistence.*;

@Entity
public class LogsClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column
    private String classLogs;

    public LogsClass() {
    }

    public LogsClass(String classLogs) {
        this.classLogs = classLogs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClassLogs() {
        return classLogs;
    }

    public void setClassLogs(String classLogs) {
        this.classLogs = classLogs;
    }
}
