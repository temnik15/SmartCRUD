package Diplom.Smart.Dubinin.SmartCRUD.model.RelationModel;


import javax.persistence.*;
@Entity
public class EDOsUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    private User user;

    @Column
    private String name;

    @Column
    private String token;

    public EDOsUser() {
    }

    public EDOsUser(User user, String token, String name) {
        this.user = user;
        this.token = token;
        this.name = name;
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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
