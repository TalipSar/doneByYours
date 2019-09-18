package com.talip.B_Service;

import com.talip.A_Repository.IOuvrierRepository;
import com.talip.Domain.Ouvrier;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

public interface IOuvrierService {

    List<Ouvrier> chercherListeOuvriers();
    Ouvrier ajouterOuvrier(Ouvrier ouvrier);

    //List<Ouvrier>  chercherParNom(Ouvrier ouvrier);




}
