package ex2;

public class Pepiniere {
    private Plante[] inventaire;
    private final int MAX_PLANTES = 1000;
    private int nombreDePlantes;

    public Pepiniere() {
        this.inventaire = new Plante[MAX_PLANTES];
        this.nombreDePlantes = 0;
    }

    public void ajoutPlante(Plante plante) {
        if (nombreDePlantes < MAX_PLANTES) {
            inventaire[nombreDePlantes] = plante;
            nombreDePlantes++;
        } else {
            System.out.println("Inventaire plein..!");
        }
    }

    public void afficherInventaire() {
    	 for (int i = 0; i < nombreDePlantes; i++) {
    		 System.out.println("Plante #"+(i+1));
             inventaire[i].description();
             inventaire[i].fleurir();
         }
    }

    public double totalAbsorptionTotaleCO2() {
        double total = 0;
        for (int i = 0; i < nombreDePlantes; i++) {
            total += inventaire[i].absorptionCO2();
        }
        return total;
    }

    public int compterArbresCaduques() {
        int count = 0;
        for (int i = 0; i < nombreDePlantes; i++) {
            if (inventaire[i].estArbreCaduque()) {
                count++;
            }
        }
        return count;
    }
}
