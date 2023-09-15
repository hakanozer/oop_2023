package com.works.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Note extends Base {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nid;

    private String title;
    private String detail;

    @ManyToMany
    private List<Category> categories;

    @PostLoad
    public void postLoad() {
        System.out.println("postLoad Call");
    }

    @PrePersist
    public void prePersist() {
        title = title.replace("Note", "***");
        System.out.println("prePersist Call - 1");
    }

    @PostPersist
    public void postPersist() {
        System.out.println("postPersist Call - 2 - ID" + nid);
    }

}
