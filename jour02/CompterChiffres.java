import java.util.Scanner;

public class CompterChiffres {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour la saisie utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir un nombre
        System.out.print("Entrez un nombre entier (positif ou négatif) : ");
        int numero = scanner.nextInt();

        // Fermeture du scanner après utilisation
        scanner.close();

        // Conversion du nombre en positif si nécessaire pour compter les chiffres
        int nombre = Math.abs(numero);

        // Comptage du nombre de chiffres
        int count = 0;
        while (nombre != 0) {
            nombre /= 10;  // Divise par 10 pour supprimer le dernier chiffre
            count++;
        }

        // Affichage du résultat
        System.out.println("Le nombre de chiffres dans " + numero + " est : " + count);
    }
}
