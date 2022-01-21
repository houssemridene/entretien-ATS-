package tn.ats.produit.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Produit {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id ;
    private String productName;
    private String description;
    private float price ;
    private String category ;
    private String imageUrl ;
    @OneToMany(
            mappedBy = "produit",
            orphanRemoval = true,
            cascade = CascadeType.ALL)
    private List<Review> reviews ;

}
