package com.Projet.Projet.Repositories;

import com.Projet.Projet.Entities.Seance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeanceRepository extends JpaRepository<Seance,Long> {
}
