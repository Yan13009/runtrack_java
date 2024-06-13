
public class MyString {
    public static void main(String[] args) {
        // Déclaration de quatre variables de type String de quatre façons différentes
        
        // 1ère façon : Initialisation directe
        String str1 = "Bonjour";

        // 2ème façon : Utilisation du mot clé 'new'
        String str2 = new String("Hello");

        // 3ème façon : Utilisation de la méthode concat() pour assembler des chaînes de caractères
        String str3 = "Hola".concat(" Mundo");

        // 4ème façon : Utilisation de la méthode format() pour créer une chaîne de caractères formatée
        String str4 = String.format("Salut %s", "le monde");

        // Affichage des valeurs des variables
        System.out.println("str1 : " + str1);
        System.out.println("str2 : " + str2);
        System.out.println("str3 : " + str3);
        System.out.println("str4 : " + str4);
    }
}
