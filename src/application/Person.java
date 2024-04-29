package application;

public class Person {
public String prenom;
public String nom;
public String adresse;
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public Person(String prenom, String nom, String adresse) {
	super();
	this.prenom = prenom;
	this.nom = nom;
	this.adresse = adresse;
}
@Override
public String toString() {
	return "Person [prenom=" + prenom + ", nom=" + nom + ", adresse=" + adresse + "]";
}


}
