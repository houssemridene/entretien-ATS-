package tn.ats.produit.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Review {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private int value ;
    @Column(name="CONTENT", length=10000)
    private String content ;
    @ManyToOne(fetch = FetchType.LAZY)
    private Produit produit;


}
