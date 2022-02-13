package Diplom.Smart.Dubinin.SmartCRUD.model.RelationModel;


import javax.persistence.*;

@Entity
public class StatusSmartContract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String status;

    public StatusSmartContract() {
    }

    public StatusSmartContract(String status) {
        this.status = status;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
