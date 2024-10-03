package nivell2.exercise2.java.com.main;

import nivell2.exercise2.java.com.modules.GenericMethods;
import nivell2.exercise2.java.com.modules.Persona;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Creem 3 instàncies de classe Persona, i les afegim a una primera llista.");
        Persona person1 = new Persona("Joan", "Vila", 56);
        Persona person2 = new Persona("Ana", "Guasch", 30);
        Persona person3 = new Persona("Albert", "Duran", 43);
        ArrayList<Persona> list1 = new ArrayList<>();
        list1.add(person1);
        list1.add(person2);
        list1.add(person3);

        System.out.println("Creem una segona llista i l'omplim amb 3 objectes File.");
        File file1 = new File("Resultats.txt");
        File file2 = new File("Config.txt");
        File file3 = new File("Instruccions.txt");
        ArrayList<File> files = new ArrayList<>();
        files.add(file1);
        files.add(file2);
        files.add(file3);
        System.out.println("Creem una tercera llista i l'omplim amb 3 cadenes de text.");
        ArrayList<String> cadenes = new ArrayList<>(Arrays.asList("animal", "ocell", "guineu"));
        System.out.println("Invoquem al mètode genèric, passant per paràmetre aquestes 3 llistes.");
        System.out.println("Comprovem que es mostren per pantalla correctament i seguint l'ordre dels arguments:");
        GenericMethods.consolePrint(list1, files, cadenes);

        System.out.println("Invoquem al mètode genèric, canviant l'ordre en què passem aquestes 3 llistes per paràmetre.");
        System.out.println("Comprovem que es mostren per pantalla correctament amb l'ordre dels arguments modificat:");
        GenericMethods.consolePrint(cadenes, files, list1);
    }
}
