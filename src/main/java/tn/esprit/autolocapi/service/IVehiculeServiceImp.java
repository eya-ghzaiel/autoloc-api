package tn.esprit.autolocapi.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolocapi.domain.Vehicule;
import tn.esprit.autolocapi.repository.VehiculeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class IVehiculeServiceImp implements IVehiculeService {

    private final VehiculeRepository vehiculeRepository;

    @Override
    public Vehicule ajouterVehicule(Vehicule v) {
        return vehiculeRepository.save(v);
    }

    @Override
    public Vehicule modifierVehicule(Vehicule v) {
        return vehiculeRepository.save(v);
    }

    @Override
    public Vehicule getVehiculeById(Long id) {
        return vehiculeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Vehicule> getAllVehicules() {
        return vehiculeRepository.findAll();
    }

    @Override
    public void supprimerVehicule(Long id) {
        vehiculeRepository.deleteById(id);
    }
}