import java.util.Scanner;

public class TableMultiplication {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour la saisie utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir un nombre
        System.out.print("Entrez un nombre pour afficher sa table de multiplication : ");
        int nombre = scanner.nextInt();

        // Fermeture du scanner après utilisation
        scanner.close();

        // Affichage de l'en-tête de la table de multiplication
        System.out.println("Table de multiplication de " + nombre + " :");

        // Boucle pour calculer et afficher la table de multiplication
        for (int i = 1; i <= 10; i++) {
            System.out.println(nombre + " x " + i + " = " + (nombre * i));
        }
    }
}
