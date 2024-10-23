package ex2;

public class testPlante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("     Pépinière GREEN HANDS");
		Pepiniere pepiniere = new Pepiniere();
		Fleur rose = new Fleur(null, 30, 12, 15.99, "Rouge", 2);
		Fleur tulipe = new Fleur("Tulipe", 20, 8, 12.99, "Jaune", 4);
		Arbre chene = new Arbre("Chene", 200, 60, 89.99, "Caduque");
		Arbre sapin = new Arbre("Sapin", 150, 30, 59.99, "Presisant");
		rose. setNom ("Rose");
		System.out.println("la "+rose.getNom()+" a le couleur "+rose.getCouleur ());
		System.out.println("Inventaire de la pepiniere: ");
		pepiniere.ajoutPlante(rose);
		pepiniere.ajoutPlante(tulipe);
		pepiniere.ajoutPlante(chene);
		pepiniere.ajoutPlante(sapin);
		pepiniere.afficherInventaire();
		System.out.println("Total Aborption CO2 "+pepiniere.totalAbsorptionTotaleCO2());
		System.out.println("Nombre d'arbres Caduques dans la pépinière : " + pepiniere.compterArbresCaduques());
	}

}
