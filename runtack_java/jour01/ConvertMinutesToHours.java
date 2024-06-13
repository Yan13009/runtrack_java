import java.util.Scanner;

public class ConvertMinutesToHours {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer le nombre de minutes
        System.out.print("Entrez le nombre de minutes : ");
        int minutes = scanner.nextInt();

        // Calculer le nombre d'heures et de minutes
        int heures = minutes / 60;  // Division entière pour obtenir le nombre d'heures
        int resteMinutes = minutes % 60;  // Le reste donne le nombre de minutes restantes

        // Formater le résultat au format HH:MM
        String heureMinute = String.format("%02d:%02d", heures, resteMinutes);

        // Afficher le résultat
        System.out.println("Le temps converti est : " + heureMinute);

        // Fermer le scanner
        scanner.close();
    }
}
