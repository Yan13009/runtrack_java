
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour la saisie utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir la hauteur du triangle
        System.out.print("Entrez la hauteur du triangle : ");
        int hauteur = scanner.nextInt();

        // Fermeture du scanner après utilisation
        scanner.close();

        // Boucle pour construire le triangle
        for (int ligne = 1; ligne <= hauteur; ligne++) {
            // Affichage des espaces pour aligner le triangle à gauche
            for (int espace = 1; espace <= hauteur - ligne; espace++) {
                System.out.print(" ");
            }

            // Affichage des étoiles pour former le triangle
            for (int etoile = 1; etoile <= 2 * ligne - 1; etoile++) {
                System.out.print("*");
            }

            // Passer à la ligne suivante après avoir construit une ligne du triangle
            System.out.println();
        }
    }
}
