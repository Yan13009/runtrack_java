
import java.util.Scanner;

public class ParallelCount {
    public static void main(String[] args) {
        // Demande à l'utilisateur de saisir le nombre maximum à compter
        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisissez le nombre maximum à compter : ");
        int maxNumber = scanner.nextInt();

        // Diviser le nombre maximum en deux plages de nombres égales
        int mid = maxNumber / 2;

        // Mesurer le temps de début
        long startTime = System.nanoTime();

        // Créer et démarrer deux threads pour compter en parallèle
        CountThread thread1 = new CountThread(1, mid);
        CountThread thread2 = new CountThread(mid + 1, maxNumber);

        thread1.start();
        thread2.start();

        // Attendre que les deux threads aient terminé
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Obtenir les résultats des threads et calculer le compte total
        int totalCount = thread1.getCount() + thread2.getCount();

        // Mesurer le temps de fin
        long endTime = System.nanoTime();

        // Calculer le temps d'exécution en millisecondes
        long duration = (endTime - startTime) / 1_000_000;

        // Afficher le compte total et le temps d'exécution
        System.out.println("Le compte total est : " + totalCount);
        System.out.println("Le programme a mis " + duration + " millisecondes pour s'exécuter.");
    }

    // Classe Thread pour compter une plage de nombres
    static class CountThread extends Thread {
        private int start;
        private int end;
        private int count;

        public CountThread(int start, int end) {
            this.start = start;
            this.end = end;
            this.count = 0;
        }

        @Override
        public void run() {
            for (int i = start; i <= end; i++) {
                count++;
            }
        }

        public int getCount() {
            return count;
        }
    }
}
