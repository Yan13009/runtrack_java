import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Déclaration et initialisation du tableau avec des valeurs exemple
        int[] tableau = {3, 7, 3, 9, 8, 9, 3};

        // Utilisation d'un HashSet pour stocker les valeurs uniques
        Set<Integer> valeursUniques = new HashSet<>();

        // Parcours du tableau et ajout des valeurs uniques au HashSet
        for (int valeur : tableau) {
            valeursUniques.add(valeur);
        }

        // Affichage des valeurs uniques
        System.out.println("Valeurs uniques du tableau:");
        for (int valeur : valeursUniques) {
            System.out.println(valeur);
        }
    }
}
