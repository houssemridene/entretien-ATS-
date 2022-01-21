package tn.ats.produit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.ats.produit.entity.Produit;
import tn.ats.produit.repository.ProduitRepository;
import tn.ats.produit.service.ProduitService;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/api")
public class ProduitController {
    @Autowired
    private ProduitService produitService;

    @GetMapping("/product/{id}")
    public Produit getProduit(@PathVariable Long id) {
        return produitService.getProduit(id);
    }

    @GetMapping("/products/{PageNo}")
    public List<Produit> getProduitParLot(@PathVariable int PageNo) {
        return produitService.getProduitParLot(PageNo);

    }

}
