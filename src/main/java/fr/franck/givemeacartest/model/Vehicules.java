package fr.franck.givemeacartest.model;

public class Vehicules {
   private String modeles;
   private String marques;
   private String typeVehicules;
   private String immatVehicules;
   private String geolocalisation;
   private String prixMinute;
   private String niveauCarburant;
   private String disponibilite;

public Vehicules (String modeles, String marques, String typeVehicules, String immatVehicules,String geolocalisation, String prixMinute,String niveauCarburant,String disponibilite ){

    this.modeles = modeles;
    this.marques = marques;
    this.typeVehicules = typeVehicules;
    this.immatVehicules = immatVehicules;
    this.geolocalisation = geolocalisation;
    this.prixMinute = prixMinute;
    this.niveauCarburant= niveauCarburant;
    this.disponibilite = disponibilite;   
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

public String getDisponibilte() {
	return disponibilite;
}

public void setDisponibilte(String disponibilite) {
	this.disponibilite = disponibilite;
}  

  
}
