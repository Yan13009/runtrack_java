import java.util.Scanner;

public class CalculFactorielle {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour la saisie utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir un nombre entier positif
        System.out.print("Entrez un nombre entier positif pour calculer sa factorielle : ");
        int nombre = scanner.nextInt();

        // Fermeture du scanner après utilisation
        scanner.close();

        // Vérification que le nombre est positif
        if (nombre < 0) {
            System.out.println("Erreur : Le nombre doit être positif.");
        } else {
            // Calcul de la factorielle du nombre
            long factorielle = 1;
            for (int i = 1; i <= nombre; i++) {
                factorielle *= i;
            }

            // Affichage du résultat
            System.out.println("La factorielle du nombre " + nombre + " est : " + factorielle);
        }
    }
}
