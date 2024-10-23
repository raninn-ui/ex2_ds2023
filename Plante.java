package ex2;

public class Plante { 
	protected String nom;
	protected double hauteur;
	protected int age;
	protected double prix;
	
	public Plante(String nom, double hauteur, int age, double prix) {
	    this.nom = nom;
	    this.hauteur = hauteur;
	    this.age = age;
	    this.prix = prix;
	}
	
	public String toString() {
	    return "Nom: " + nom + ", Hauteur: " + hauteur + "cm, Age: " + age + " mois, Prix: " + prix + "dinars";
	}
	
	public void description() {
	    System.out.println(this.toString());
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void fleurir() {
	}

	public double absorptionCO2() {
		return 0;
	}

	public boolean estArbreCaduque() {
		return false;
	}
	
}
