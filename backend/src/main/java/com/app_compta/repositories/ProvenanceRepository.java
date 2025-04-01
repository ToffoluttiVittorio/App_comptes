package com.app_compta.repositories;

import com.app_compta.models.Provenance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvenanceRepository extends JpaRepository<Provenance, Long> {
}
