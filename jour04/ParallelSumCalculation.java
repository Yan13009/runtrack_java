
import java.util.concurrent.*;

public class ParallelSumCalculation {
    public static void main(String[] args) {
        final int MAX_NUM = 10_000_000;
        final int NUM_THREADS = 4; // Nombre de threads à utiliser

        // Création d'un pool de threads avec ExecutorService
        ExecutorService executor = Executors.newFixedThreadPool(NUM_THREADS);

        // Liste pour stocker les futures des résultats partiels
        java.util.List<Future<Long>> futures = new java.util.ArrayList<>();

        // Diviser la tâche en sous-tâches pour chaque thread
        int step = MAX_NUM / NUM_THREADS;
        int start = 1;
        int end = start + step - 1;

        // Soumettre les tâches aux threads
        for (int i = 0; i < NUM_THREADS; i++) {
            if (i == NUM_THREADS - 1) {
                // Dernier thread s'occupe de la fin restante
                end = MAX_NUM;
            }

            Callable<Long> task = new SumCallable(start, end);
            Future<Long> future = executor.submit(task);
            futures.add(future);

            start = end + 1;
            end = start + step - 1;
        }

        // Récupérer les résultats des threads et calculer la somme totale
        long totalSum = 0;
        for (Future<Long> future : futures) {
            try {
                totalSum += future.get(); // get() bloque jusqu'à ce que le résultat soit disponible
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        // Afficher la somme totale
        System.out.println("Somme totale de 1 à " + MAX_NUM + " : " + totalSum);

        // Arrêter le pool de threads
        executor.shutdown();
    }

    // Callable pour calculer la somme dans une plage donnée
    static class SumCallable implements Callable<Long> {
        private int start;
        private int end;

        public SumCallable(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public Long call() {
            long sum = 0;
            for (int i = start; i <= end; i++) {
                sum += i;
            }
            return sum;
        }
    }
}
