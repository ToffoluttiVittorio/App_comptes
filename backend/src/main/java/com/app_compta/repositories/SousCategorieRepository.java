package com.app_compta.repositories;

import com.app_compta.models.SousCategorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SousCategorieRepository extends JpaRepository<SousCategorie, Long> {
}
