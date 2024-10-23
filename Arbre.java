package ex2;

class Arbre extends Plante{
	private String type_Feuillage;
	private double AbsorMoyenne = 22;
	
	public Arbre(String nom, double hauteur, int age, double prix, String type_Feuillage) {
		super(nom, hauteur, age, prix);
		this.type_Feuillage=type_Feuillage;
	}
	
	public void description() {
        super.description();
        System.out.println("Type de feuillage: " + type_Feuillage);
	}
	
	public double absorptionCO2() {
		if (hauteur>50) {
			return AbsorMoyenne+3;
		}
		else 
			return AbsorMoyenne;
	}

	public boolean estArbreCaduque() {
        return type_Feuillage.equals("Caduque");
    }
}