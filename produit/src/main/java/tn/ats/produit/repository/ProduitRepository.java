package tn.ats.produit.repository;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import tn.ats.produit.entity.Produit;
@Repository
public interface ProduitRepository extends PagingAndSortingRepository<Produit, Long> {
}
