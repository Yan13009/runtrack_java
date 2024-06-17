import java.util.Scanner;

public class SequentialSum {
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

        // Mesurer le temps de début
        long startTime = System.nanoTime();

        // Calculer la somme des éléments du tableau à l'aide d'une boucle
        int somme = 0;
        for (int num : tableau) {
            somme += num;
        }

        // Mesurer le temps de fin
        long endTime = System.nanoTime();

        // Calculer le temps d'exécution en millisecondes
        long duration = (endTime - startTime) / 1_000_000;

        // Afficher la somme totale et le temps d'exécution
        System.out.println("La somme des éléments du tableau est : " + somme);
        System.out.println("Le programme a mis " + duration + " millisecondes pour s'exécuter.");

        // Fermer le scanner
        scanner.close();
    }
}
