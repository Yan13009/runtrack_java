import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Déclaration et initialisation de la matrice
        int[][] tableau = {
            {5, 9, 3},
            {7, 2, 8},
            {1, 6, 4}
        };

        // Affichage de la matrice originale
        System.out.println("Matrice originale:");
        afficherMatrice(tableau);

        // Tri de la matrice
        trierMatrice(tableau);

        // Affichage de la matrice triée
        System.out.println("Matrice triée:");
        afficherMatrice(tableau);
    }

    // Méthode pour afficher les valeurs d'une matrice
    public static void afficherMatrice(int[][] matrice) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Méthode pour trier une matrice
    public static void trierMatrice(int[][] matrice) {
        int rows = matrice.length;
        int cols = matrice[0].length;
        int[] temp = new int[rows * cols];
        int k = 0;

        // Extraction des éléments de la matrice dans un tableau unidimensionnel
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                temp[k++] = matrice[i][j];
            }
        }

        // Tri du tableau unidimensionnel
        Arrays.sort(temp);

        // Réinsertion des éléments triés dans la matrice
        k = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrice[i][j] = temp[k++];
            }
        }
    }
}
