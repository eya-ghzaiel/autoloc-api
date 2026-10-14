package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Vehicule;

import java.util.List;

public interface IVehiculeService {
  public Vehicule ajouterVehicule(Vehicule v);
  public Vehicule modifierVehicule(Vehicule v);
  public Vehicule getVehiculeById(Long id);
  public List<Vehicule> getAllVehicules();
  public void supprimerVehicule(Long id);
}
