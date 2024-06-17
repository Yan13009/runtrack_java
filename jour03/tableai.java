public class Main {
    public static void main(String[] args) {
        // Déclaration et initialisation des matrices
        int[][] matrice1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrice2 = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        // Affichage des valeurs de matrice1
        System.out.println("Valeurs de matrice1 :");
        afficherMatrice(matrice1);

        // Addition des valeurs de matrice1 et matrice2
        int[][] resultat = new int[3][3];
        for (int i = 0; i < matrice1.length; i++) {
            for (int j = 0; j < matrice1[i].length; j++) {
                resultat[i][j] = matrice1[i][j] + matrice2[i][j];
            }
        }

        // Affichage des valeurs de la matrice résultat
        System.out.println("Valeurs de la matrice résultante (matrice1 + matrice2) :");
        afficherMatrice(resultat);
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
}
