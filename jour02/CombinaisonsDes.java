public class CombinaisonsDes {
    public static void main(String[] args) {
        // Déclaration et initialisation du nombre de faces d'un dé
        int faces = 6;

        // Compteur pour le nombre total de combinaisons
        int totalCombinaisons = 0;

        // Boucle pour générer toutes les combinaisons
        for (int de1 = 1; de1 <= faces; de1++) {
            for (int de2 = 1; de2 <= faces; de2++) {
                for (int de3 = 1; de3 <= faces; de3++) {
                    // Affichage de la combinaison actuelle
                    System.out.println(de1 + " " + de2 + " " + de3);
                    // Incrémentation du compteur de combinaisons
                    totalCombinaisons++;
                }
            }
        }

        // Affichage du nombre total de combinaisons
        System.out.println("Nombre total de combinaisons : " + totalCombinaisons);
    }
}
