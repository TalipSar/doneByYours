package com.talip.C_Rest;

import com.talip.B_Service.IProjetService;
import com.talip.Domain.Projet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projets")
@CrossOrigin
public class ProjetRest {


    @Autowired
    private IProjetService projetService;

    @GetMapping
    List<Projet> showList(){ return projetService.chercherListeProjets(); }

    @PostMapping
    Projet ajouterProjet(@RequestBody Projet projet){return projetService.nouveauProjet(projet);}
}
