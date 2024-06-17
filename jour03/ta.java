import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Déclaration du tableau de 10 éléments
        int[] tableau = new int[10];

        // Création d'une instance de la classe Random
        Random rand = new Random();

        // Remplissage du tableau avec des nombres entiers aléatoires
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = rand.nextInt(100); // Génère un nombre entier aléatoire entre 0 et 99
        }

        // Affichage du tableau dans le terminal
        System.out.println("Valeurs du tableau :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Index " + i + ": " + tableau[i]);
        }
    }
}
