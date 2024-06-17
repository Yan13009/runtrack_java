public class Main {
    public static void main(String[] args) {
        // Déclaration et initialisation du tableau avec les valeurs initiales
        int[] monTableau = {12, 6, 76, 89};

        // Affichage des valeurs initiales du tableau
        System.out.println("Valeurs initiales du tableau:");
        afficherTableau(monTableau);

        // Assignation de nouvelles valeurs au tableau
        monTableau[0] = 15;
        monTableau[1] = 30;
        monTableau[2] = 45;
        monTableau[3] = 60;

        // Affichage des nouvelles valeurs du tableau
        System.out.println("Nouvelles valeurs du tableau:");
        afficherTableau(monTableau);
    }

    // Méthode pour afficher les valeurs du tableau
    public static void afficherTableau(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Index " + i + ": " + tableau[i]);
        }
    }
}
