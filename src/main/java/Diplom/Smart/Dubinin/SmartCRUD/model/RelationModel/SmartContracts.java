package Diplom.Smart.Dubinin.SmartCRUD.model.RelationModel;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
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

    public SmartContracts(Long idTemplate, EDOsUser edOsUser, StatusSmartContract statusSmartContract, EDOsUser edOsUserTwo, String key, String name) {
        this.idTemplate = idTemplate;
        this.edOsUserOne = edOsUser;
        this.edOsUserTwo = edOsUserTwo;
        this.statusSmartContract = statusSmartContract;
        this.key = key;
        this.name = name;
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
