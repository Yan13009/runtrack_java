import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Déclaration et initialisation du tableau avec les valeurs spécifiées
        int[] tableau = {3, 7, 3, 9, 8};

        // Utilisation d'une HashMap pour compter les occurrences de chaque nombre
        Map<Integer, Integer> occurrences = new HashMap<>();

        // Parcours du tableau et comptage des occurrences
        for (int nombre : tableau) {
            if (occurrences.containsKey(nombre)) {
                occurrences.put(nombre, occurrences.get(nombre) + 1);
            } else {
                occurrences.put(nombre, 1);
            }
        }

        // Affichage des résultats
        System.out.println("Nombre d'occurrences de chaque nombre:");
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            System.out.println("Nombre " + entry.getKey() + ": " + entry.getValue() + " fois");
        }
    }
}
