import java.util.Scanner;

public class EchangeChaines {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour la saisie utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir la première chaîne
        System.out.print("Entrez la première chaîne : ");
        String chaine1 = scanner.nextLine();

        // Demande à l'utilisateur de saisir la deuxième chaîne
        System.out.print("Entrez la deuxième chaîne : ");
        String chaine2 = scanner.nextLine();

        // Affichage des chaînes avant l'échange
        System.out.println("Avant l'échange :");
        System.out.println("Chaine 1 : " + chaine1);
        System.out.println("Chaine 2 : " + chaine2);

        // Échange des valeurs des chaînes sans variable supplémentaire
        chaine1 = chaine1 + chaine2; // concaténation de chaine1 et chaine2
        chaine2 = chaine1.substring(0, chaine1.length() - chaine2.length()); // extraction de chaine1
        chaine1 = chaine1.substring(chaine2.length()); // extraction de chaine2

        // Affichage des chaînes après l'échange
        System.out.println("\nAprès l'échange :");
        System.out.println("Chaine 1 : " + chaine1);
        System.out.println("Chaine 2 : " + chaine2);

        // Fermeture du scanner après utilisation
        scanner.close();
    }
}
