import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class RandomStringToFile {
    public static void main(String[] args) {
        // Demande à l'utilisateur de saisir la longueur de la chaîne de caractères
        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisissez la longueur de la chaîne de caractères aléatoire à générer : ");
        int length = scanner.nextInt();

        // Mesurer le temps de début
        long startTime = System.nanoTime();

        // Générer la chaîne de caractères aléatoire
        String randomString = generateRandomString(length);

        // Écrire la chaîne de caractères dans un fichier texte
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(randomString);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Mesurer le temps de fin
        long endTime = System.nanoTime();

        // Calculer et afficher le temps d'exécution
        long duration = (endTime - startTime) / 1_000_000; // Convertir en millisecondes
        System.out.println("Le programme a mis " + duration + " millisecondes pour s'exécuter.");
    }

    // Méthode pour générer une chaîne de caractères aléatoire
    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }

        return sb.toString();
    }
}
