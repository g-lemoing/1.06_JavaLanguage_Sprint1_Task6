package nivell1.exercise2.java.com.main;

import nivell1.exercise2.java.com.modules.*;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        System.out.println("Creem una instància de classe Persona");
        Persona person = new Persona("Joan", "Vila", 56);
        System.out.println("De la mateixa manera, creem un objecte File amb nom de fitxer 'Resultats.txt'.");
        File file = new File("Resultats.txt");
        System.out.println("Fent servir el mètode genèric que rep tres paràmetres, mostrem per pantalla la persona, el fitxer i una cadena 'person':");
        GenericMethods.consolePrint(person, file, "person");
        System.out.println("De la mateixa manera, mostrem per pantalla ara el fitxer, un nombre i la persona:");
        GenericMethods.consolePrint(file, 233, person);
    }
}
