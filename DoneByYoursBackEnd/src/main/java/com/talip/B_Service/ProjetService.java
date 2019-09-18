package com.talip.B_Service;

import com.talip.A_Repository.IProjetRepository;
import com.talip.Domain.Projet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetService implements IProjetService {

    @Autowired
    private IProjetRepository projetRepository;


    @Override
    public List<Projet> chercherListeProjets() {
        return projetRepository.findAll();
    }

    @Override
    public Projet nouveauProjet (Projet projet) {
        System.out.print(projet.getDate() );

        return projetRepository.save(projet);
    }
}
