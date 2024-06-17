public class Main {
    public static void main(String[] args) {
        // Déclaration du tableau de cinq éléments de type int
        int[] tableau = new int[5];

        // Assignation des valeurs aux indices spécifiés
        tableau[0] = 10; // Index 0
        tableau[2] = 2;  // Index 2
        tableau[4] = 69; // Index 4

        // Affichage du tableau complet
        System.out.println("Contenu du tableau:");
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Index " + i + ": " + tableau[i]);
        }

        // Affichage de la valeur à l'index 1
        System.out.println("Valeur à l'index 1: " + tableau[1]);
    }
}
