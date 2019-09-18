package com.talip.B_Service;

import com.talip.A_Repository.IOuvrierRepository;
import com.talip.Domain.Ouvrier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class OuvrierService implements IOuvrierService {

    @Autowired
    private IOuvrierRepository ouvrierRepository;


    @Override
    public List<Ouvrier> chercherListeOuvriers() {
        return ouvrierRepository.findAll();
    }

    @Override
    public Ouvrier ajouterOuvrier(Ouvrier ouvrier) {
        return ouvrierRepository.save(ouvrier);
    }



   /* @Override
    public Ouvrier afficherOuvrier(String name) {
        return ouvrierRepository.findFirstByNameEquals(name);
    }*/
}
