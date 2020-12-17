package fr.franck.givemeacartest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import fr.franck.givemeacartest.model.Vehicules;
import fr.franck.givemeacartest.repository.VehiculeRepo;


@RestController
@RequestMapping("/vehicules")
public class HelloController {

    @Autowired
    VehiculeRepo vehiculeRepo;

    @GetMapping("/voitures")
    public List<Vehicules> afficherVehicules(){
        return vehiculeRepo.findAll();
    }

    @GetMapping("/id")
    public Vehicules idVehicules(@PathVariable(value = "id") int id){
        return vehiculeRepo.findById(id);
    }
    

    // Stock stockG = new Stock();
    // @GetMapping("/")
    // public ModelAndView accueil() {
    //     ModelAndView hello = new ModelAndView();
    //     hello.setViewName("accueil");
    //     return hello;
    // }
    // @GetMapping("/stock")
    // public ModelAndView stock() {
    //     ModelAndView yo = new ModelAndView();
    //     yo.setViewName("stock");
    //     yo.addObject("stock", new Stock());
    //     return yo;
    // }
}

