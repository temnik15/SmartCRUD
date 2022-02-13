package Diplom.Smart.Dubinin.SmartCRUD.model.RelationModel;

import javax.persistence.*;

@Entity
public class IssuedTokens {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @Column
    private String token;


    public IssuedTokens() {
    }

    public IssuedTokens(User user, String token) {
        this.user = user;
        this.token = token;
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
}
