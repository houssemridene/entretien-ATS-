package tn.ats.produit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import tn.ats.produit.entity.Produit;
import tn.ats.produit.repository.ProduitRepository;
import tn.ats.produit.repository.ReviewRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProduitService {
    @Autowired
    ProduitRepository produitRepository ;
    @Autowired
    ReviewRepository reviewRepository ;


    public Produit getProduit(Long id) {
        return produitRepository.findById(id).get();
    }
    public List<Produit> getProduitParLot(int PageNo) {
        Pageable paging = PageRequest.of(PageNo,20);

        Page<Produit> pagedResult = produitRepository.findAll(paging);

        if(pagedResult.hasContent()) {
            return pagedResult.getContent();
        } else {
            return new ArrayList<Produit>();
        }
    }

    }

