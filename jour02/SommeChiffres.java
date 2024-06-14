public class SommeChiffres {
    public static void main(String[] args) {
        // Nombre à traiter
        int nombre = 1234;

        // Initialisation de la somme des chiffres
        int somme = 0;

        // Traitement pour additionner tous les chiffres
        int chiffre = nombre;
        while (chiffre > 0) {
            somme += chiffre % 10;   // Ajoute le dernier chiffre à la somme
            chiffre /= 10;           // Retire le dernier chiffre du nombre
        }

        // Affichage du résultat
        System.out.println("La somme des chiffres est : " + somme);
    }
}
