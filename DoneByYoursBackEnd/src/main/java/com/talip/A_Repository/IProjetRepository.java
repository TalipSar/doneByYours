package com.talip.A_Repository;

import com.talip.Domain.Projet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProjetRepository extends JpaRepository<Projet, String> {
   // CRUD are defined by default

}
