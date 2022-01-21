package tn.ats.produit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.ats.produit.entity.Review;
@Repository
public interface ReviewRepository extends JpaRepository<Review,Long> {
}
