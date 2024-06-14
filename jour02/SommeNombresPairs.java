public class SommeNombresPairs {
    public static void main(String[] args) {
        // Initialisation de la variable pour stocker la somme des nombres pairs
        int sommePairs = 0;

        // Parcours des nombres de 1 à 100
        for (int i = 1; i <= 100; i++) {
            // Vérification si le nombre est pair
            if (i % 2 == 0) {
                // Ajout du nombre pair à la somme
                sommePairs += i;
            }
        }

        // Affichage de la somme des nombres pairs
        System.out.println("La somme des nombres pairs de 1 à 100 est : " + sommePairs);
    }
}
