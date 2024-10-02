package nivell2.exercise1.java.com.main;

import nivell2.exercise1.java.com.modules.GenericMethods;
import nivell2.exercise1.java.com.modules.Persona;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hem modificat el tercer argument del mètode d'impressió, perquè sigui no genèric i de tipus String.");
        System.out.println("Creem una instància de classe Persona.");
        Persona person = new Persona("Joan", "Vila", 56);
        System.out.println("De la mateixa manera, creem un objecte File amb nom de fitxer 'Resultats.txt'.");
        File file = new File("Resultats.txt");
        System.out.println("Fent servir el mètode genèric que rep tres paràmetres, mostrem per pantalla l'objecte Persona, el fitxer i una cadena 'person':");
        GenericMethods.consolePrint(person, file, "person");
        System.out.println("El mètode ha funcionat correctament perquè el tercer argument coindideix amb l'esperat (String)");
        System.out.println("En canvi, provocarà un error si volem mostrar per pantalla el fitxer, un nombre i l'objecte Persona,\nper incompatibilitat de tipus en el 3r argument.");
    }
}
