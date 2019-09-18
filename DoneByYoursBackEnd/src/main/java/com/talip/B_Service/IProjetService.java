package com.talip.B_Service;

import com.talip.Domain.Projet;

import java.util.List;

public interface IProjetService {

    List<Projet> chercherListeProjets();
    Projet nouveauProjet (Projet projet);
}
