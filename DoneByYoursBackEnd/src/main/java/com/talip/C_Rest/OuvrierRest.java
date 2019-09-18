package com.talip.C_Rest;

import com.talip.B_Service.IOuvrierService;
import com.talip.Domain.Ouvrier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/ouvriers")
@CrossOrigin
public class OuvrierRest {

    @Autowired
    private IOuvrierService ouvrierService;

/*    @GetMapping
    Ouvrier findById(String name){
        return ouvrierService.afficherOuvrier(name);
    }*/

    @GetMapping
    List<Ouvrier> showList(){
        return ouvrierService.chercherListeOuvriers();
    }

    @PostMapping
    Ouvrier ajouterOuvrier(@RequestBody Ouvrier ouvrier){ return ouvrierService.ajouterOuvrier(ouvrier);}
}
