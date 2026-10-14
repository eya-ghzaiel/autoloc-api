package tn.esprit.autolocapi.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.autolocapi.domain.Vehicule;
import tn.esprit.autolocapi.repository.VehiculeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class IVehiculeServiceImp implements IVehiculeService {

    /* @Autowired
    private VehiculeRepository VehiculeRepository;
     */

    private final VehiculeRepository VehiculeRepository;
    @Override

    public Vehicule ajouterVehicule(Vehicule v) {
        return VehiculeRepository.save(v) ;
    }

    @Override
    public Vehicule modifierVehicule(Vehicule v) {
        return VehiculeRepository.save(v);
    }

    @Override
    public Vehicule getVehiculeById(Long id) {
        return VehiculeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Vehicule> getAllVehicules() {
        return VehiculeRepository.findAll();
    }

    @Override
    public void supprimerVehicule(Long id) {
        VehiculeRepository.deleteById(id);
    }
}
