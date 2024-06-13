public class Facture {
    public static void main(String[] args) {
        // Déclaration et initialisation des variables
        double prix = 49.99;
        int quantite = 3;
        
        // Calcul du montant hors taxe
        double tarifHT = prix * quantite;
        
        // Déclaration et initialisation de la TVA
        double tva = 0.20;
        
        // Calcul du montant avec TVA
        double tarifTTC = tarifHT * (1 + tva);
        
        // Affichage des différentes valeurs de la facture
        System.out.println("Prix unitaire : " + prix + " €");
        System.out.println("Quantité : " + quantite);
        System.out.println("Montant HT : " + tarifHT + " €");
        System.out.println("Montant de la TVA : " + (tarifHT * tva) + " €");
        System.out.println("Montant TTC : " + tarifTTC + " €");
    }
}
