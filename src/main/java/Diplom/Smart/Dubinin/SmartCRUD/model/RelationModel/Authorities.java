package Diplom.Smart.Dubinin.SmartCRUD.model.RelationModel;

import javax.persistence.*;

@Entity
public class Authorities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column
    private String authority;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public Authorities() {
    }

    public Authorities(String authority) {
        this.authority = authority;
    }
}
