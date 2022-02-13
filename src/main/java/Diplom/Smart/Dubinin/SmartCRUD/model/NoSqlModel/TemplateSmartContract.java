package Diplom.Smart.Dubinin.SmartCRUD.model.NoSqlModel;

import org.springframework.data.mongodb.core.mapping.Document;


import javax.persistence.Id;

@Document
public class TemplateSmartContract {

    @Id
    private Long id;

    private String doc;

    public TemplateSmartContract(Long id, String doc) {
        this.id = id;
        this.doc = doc;
    }

    public TemplateSmartContract() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }
}
