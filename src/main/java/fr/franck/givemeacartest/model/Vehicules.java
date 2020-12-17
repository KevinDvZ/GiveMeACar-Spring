package fr.franck.givemeacartest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicules {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
   private String modeles;
   private String marques;
   private String typeVehicules;
   private String immatVehicules;
   private String geolocalisation;
   private String prixMinute;
   private String niveauCarburant;
   private String disponibilite;
public Vehicules() {
	// TODO Auto-generated constructor stub
}
public Vehicules (int id, String modeles, String marques, String typeVehicules, String immatVehicules,String geolocalisation, String prixMinute,String niveauCarburant,String disponibilite ){
	this.id = id;
    this.modeles = modeles;
    this.marques = marques;
    this.typeVehicules = typeVehicules;
    this.immatVehicules = immatVehicules;
    this.geolocalisation = geolocalisation;
    this.prixMinute = prixMinute;
    this.niveauCarburant= niveauCarburant;
    this.disponibilite = disponibilite;   
  }

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getModeles() {
	return modeles;
}

public void setModeles(String modeles) {
	this.modeles = modeles;
}

public String getMarques() {
	return marques;
}

public void setMarques(String marques) {
	this.marques = marques;
}

public String getTypeVehicules() {
	return typeVehicules;
}

public void setTypeVehicules(String typeVehicules) {
	this.typeVehicules = typeVehicules;
}

public String getImmatVehicules() {
	return immatVehicules;
}

public void setImmatVehicules(String immatVehicules) {
	this.immatVehicules = immatVehicules;
}

public String getGeolocalisation() {
	return geolocalisation;
}

public void setGeolocalisation(String geolocalisation) {
	this.geolocalisation = geolocalisation;
}

public String getPrixMinute() {
	return prixMinute;
}

public void setPrixMinute(String prixMinute) {
	this.prixMinute = prixMinute;
}

public String getNiveauCarburant() {
	return niveauCarburant;
}

public void setNiveauCarburant(String niveauCarburant) {
	this.niveauCarburant = niveauCarburant;
}

public String getDisponibilté() {
	return disponibilite;
}

public void setDisponibilté( String disponibilite) {
	this.disponibilite = disponibilite;
}  

  
}
