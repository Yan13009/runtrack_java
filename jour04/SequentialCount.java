import java.util.Scanner;

public class SequentialCount {
    public static void main(String[] args) {
        // Demande à l'utilisateur de saisir le nombre maximum à compter
        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisissez le nombre maximum à compter : ");
        int maxNumber = scanner.nextInt();

        // Mesurer le temps de début
        long startTime = System.nanoTime();

        // Compter de 1 jusqu'au nombre maximum à l'aide d'une boucle
        int count = 0;
        for (int i = 1; i <= maxNumber; i++) {
            count++;
        }

        // Mesurer le temps de fin
        long endTime = System.nanoTime();

        // Calculer le temps d'exécution en millisecondes
        long duration = (endTime - startTime) / 1_000_000;

        // Afficher le compte total et le temps d'exécution
        System.out.println("Le compte total est : " + count);
        System.out.println("Le programme a mis " + duration + " millisecondes pour s'exécuter.");
    }
}

