package Diplom.Smart.Dubinin.SmartCRUD.model.RelationModel;


import javax.persistence.*;

@Entity
public class SmartContracts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long idTemplate;

    @ManyToOne
    private EDOsUser edOsUserOne;


    @ManyToOne
    private EDOsUser edOsUserTwo;

    @ManyToOne
    private StatusSmartContract statusSmartContract;

    @Column
    private String name;

    @Column
    private String key;

    public SmartContracts() {
    }

    public SmartContracts(Long idTemplate, EDOsUser edOsUser, StatusSmartContract statusSmartContract, EDOsUser edOsUserTwo) {
        this.idTemplate = idTemplate;
        this.edOsUserOne = edOsUser;
        this.edOsUserTwo = edOsUserTwo;
        this.statusSmartContract = statusSmartContract;
    }


    @Override
    public String toString() {
        return "SmartContracts{" +
                "id=" + id +
                ", idTemplate=" + idTemplate +
                ", edOsUserOne=" + edOsUserOne +
                ", edOsUserTwo=" + edOsUserTwo +
                ", statusSmartContract=" + statusSmartContract +
                '}';
    }
}