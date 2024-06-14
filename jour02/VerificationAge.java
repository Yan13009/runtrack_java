import java.util.Scanner;

public class VerificationAge {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour la saisie utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir son âge
        System.out.print("Entrez votre âge : ");
        int age = scanner.nextInt();

        // Fermeture du scanner après utilisation
        scanner.close();

        // Vérification de l'âge et affichage du résultat approprié
        if (age < 16) {
            System.out.println("Désolé, vous êtes trop jeune pour travailler.");
        } else if (age > 55) {
            System.out.println("Vous pourriez rencontrer des difficultés pour trouver un emploi.");
        } else if (age == 67) {
            System.out.println("Vous êtes à l'âge de la retraite.");
        } else {
            System.out.println("Vous avez l'âge pour travailler.");
        }
    }
}
