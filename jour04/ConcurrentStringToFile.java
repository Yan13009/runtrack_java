import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class ConcurrentStringToFile {
    public static void main(String[] args) {
        // Demande à l'utilisateur de saisir la longueur de la chaîne de caractères
        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisissez la longueur de la chaîne de caractères aléatoire à générer : ");
        int length = scanner.nextInt();

        // Mesurer le temps de début
        long startTime = System.nanoTime();

        // Générer la chaîne de caractères aléatoire
        String randomString = generateRandomString(length);

        // Diviser la chaîne en deux parties
        int middleIndex = randomString.length() / 2;
        String firstHalf = randomString.substring(0, middleIndex);
        String secondHalf = randomString.substring(middleIndex);

        // Créer et démarrer deux threads pour écrire dans le fichier
        Thread thread1 = new Thread(new WriteToFileTask(firstHalf));
        Thread thread2 = new Thread(new WriteToFileTask(secondHalf));

        thread1.start();
        thread2.start();

        try {
            // Attendre que les deux threads aient terminé
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
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

    // Tâche Runnable pour écrire une chaîne dans un fichier
    static class WriteToFileTask implements Runnable {
        private String content;

        public WriteToFileTask(String content) {
            this.content = content;
        }

        @Override
        public void run() {
            try (FileWriter writer = new FileWriter("output.txt", true)) {
                writer.write(content);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
