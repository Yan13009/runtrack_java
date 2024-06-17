
public class Main {
    public static void main(String[] args) {
        // Déclaration et initialisation du tableau avec les noms spécifiés
        String[] noms = {"Josette", "John", "Myrtille", "Marc"};

        // Affichage de la valeur "John"
        System.out.println("Valeur à l'index 1: " + noms[1]);

        // Changement de la valeur "Myrtille" à "Mireille"
        noms[2] = "Mireille";

        // Affichage des valeurs du tableau après modification
        System.out.println("Valeurs du tableau après modification:");
        afficherTableau(noms);
    }

    // Méthode pour afficher les valeurs du tableau
    public static void afficherTableau(String[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Index " + i + ": " + tableau[i]);
        }
    }
}
