package Diplom.Smart.Dubinin.SmartCRUD.model.NoSqlModel;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;

@Document
public class Documentation {

    @Id
    private Long id;

    @Field
    private String Document;

    public Documentation(Long id, String document) {
        this.id = id;
        Document = document;
    }

    public Documentation() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDocument() {
        return Document;
    }

    public void setDocument(String document) {
        Document = document;
    }
}
