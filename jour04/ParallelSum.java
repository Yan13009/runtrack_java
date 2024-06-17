
import java.util.Scanner;

public class ParallelSum {
    public static void main(String[] args) {
        // Demander à l'utilisateur de saisir la taille du tableau
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la taille du tableau : ");
        int size = scanner.nextInt();

        // Créer le tableau et demander à l'utilisateur de saisir les éléments
        int[] tableau = new int[size];
        System.out.println("Entrez les éléments du tableau : ");
        for (int i = 0; i < size; i++) {
            tableau[i] = scanner.nextInt();
        }

        // Diviser le tableau en deux moitiés
        int mid = size / 2;

        // Mesurer le temps de début
        long startTime = System.nanoTime();

        // Créer et démarrer deux threads pour calculer la somme en parallèle
        SumThread thread1 = new SumThread(tableau, 0, mid - 1);
        SumThread thread2 = new SumThread(tableau, mid, size - 1);

        thread1.start();
        thread2.start();

        // Attendre que les deux threads aient terminé
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Obtenir les résultats des threads et calculer la somme totale
        int totalSum = thread1.getSum() + thread2.getSum();

        // Mesurer le temps de fin
        long endTime = System.nanoTime();

        // Calculer le temps d'exécution en millisecondes
        long duration = (endTime - startTime) / 1_000_000;

        // Afficher la somme totale et le temps d'exécution
        System.out.println("La somme totale des éléments du tableau est : " + totalSum);
        System.out.println("Le programme a mis " + duration + " millisecondes pour s'exécuter.");

        // Fermer le scanner
        scanner.close();
    }

    // Classe Thread pour calculer la somme d'une plage de nombres
    static class SumThread extends Thread {
        private int[] tableau;
        private int start;
        private int end;
        private int sum;

        public SumThread(int[] tableau, int start, int end) {
            this.tableau = tableau;
            this.start = start;
            this.end = end;
            this.sum = 0;
        }

        @Override
        public void run() {
            for (int i = start; i <= end; i++) {
                sum += tableau[i];
            }
        }

        public int getSum() {
            return sum;
        }
    }
}
