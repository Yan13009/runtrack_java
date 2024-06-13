import java.util.Scanner;

public class NomPrenom {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour la saisie utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur son prénom
        System.out.print("Entrez votre prénom : ");
        String prenom = scanner.nextLine();

        // Demande à l'utilisateur son nom
        System.out.print("Entrez votre nom : ");
        String nom = scanner.nextLine();

        // Fermeture du scanner après utilisation
        scanner.close();

        // Affichage du prénom et nom de l'utilisateur concaténés
        System.out.println("Bonjour " + prenom + " " + nom + " !");
    }
}
