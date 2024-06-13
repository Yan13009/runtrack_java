public class ExerciceVariables {
    public static void main(String[] args) {
        // Déclaration et initialisation des variables num1 et num2
        int num1 = 5;
        int num2 = 10;

        // Affichage des valeurs initiales des variables
        System.out.println("Valeur initiale de num1 : " + num1);
        System.out.println("Valeur initiale de num2 : " + num2);

        // Échange des valeurs des variables
        int temp = num1;
        num1 = num2;
        num2 = temp;

        // Affichage des nouvelles valeurs après échange
        System.out.println("Nouvelle valeur de num1 : " + num1);
        System.out.println("Nouvelle valeur de num2 : " + num2);
    }
}
