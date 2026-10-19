package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Vehicule;

import java.util.List;

public interface IVehiculeService {
  Vehicule ajouterVehicule(Vehicule v);
  Vehicule modifierVehicule(Vehicule v);
  Vehicule getVehiculeById(Long id);
  List<Vehicule> getAllVehicules();
  void supprimerVehicule(Long id);
}