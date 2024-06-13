
public class Somme {
    // Méthode pour calculer la somme de deux nombres
    public static void calculerSomme(int nombre1, int nombre2) {
        // Calcul de la somme
        int somme = nombre1 + nombre2;
        
        // Affichage du résultat dans le terminal
        System.out.println("La somme de " + nombre1 + " et " + nombre2 + " est : " + somme);
    }
    
    // Méthode main pour tester la classe Somme
    public static void main(String[] args) {
        // Exemple d'utilisation de la méthode calculerSomme
        calculerSomme(10, 20);
        
        // Vous pouvez ajouter d'autres exemples ici pour tester avec différents nombres
        calculerSomme(5, 8);
    }
}
