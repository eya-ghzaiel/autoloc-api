package tn.esprit.autolocapi.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Vehicule;
import tn.esprit.autolocapi.service.IVehiculeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/vehicule")
public class VehiculeController {

    private final IVehiculeService vehiculeService;

    @PostMapping("/ajouterVehicule")
    public Vehicule ajouterVehicule(@RequestBody Vehicule v) {
        return vehiculeService.ajouterVehicule(v);
    }

    @PutMapping("/modifierVehicule")
    public Vehicule modifierVehicule(@RequestBody Vehicule v) {
        return vehiculeService.modifierVehicule(v);
    }

    @GetMapping("/getAllVehicules")
    public List<Vehicule> getAllVehicules() {
        return vehiculeService.getAllVehicules();
    }

    @GetMapping("/recupererVehicule/{id}")
    public Vehicule getVehiculeById(@PathVariable("id") Long id) {
        return vehiculeService.getVehiculeById(id);
    }

    @DeleteMapping("/supprimerVehicule/{id}")
    public void supprimerVehicule(@PathVariable Long id) {
        vehiculeService.supprimerVehicule(id);
    }
}




