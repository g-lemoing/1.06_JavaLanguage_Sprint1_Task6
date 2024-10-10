package nivell2.exercise2.java.com.main;

import nivell2.exercise2.java.com.modules.GenericMethods;
import nivell2.exercise2.java.com.modules.Persona;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Creem 1 instància de classe Persona.");
        Persona person1 = new Persona("Joan", "Vila", 56);

        System.out.println("Creem una segona llista i l'omplim amb 3 objectes File.");
        File file1 = new File("Resultats.txt");
        File file2 = new File("Config.txt");
        File file3 = new File("Instruccions.txt");
        List<File> files = Arrays.asList(file1, file2, file3);
        ArrayList<String> cadenes = new ArrayList<>(Arrays.asList("animal", "ocell", "guineu"));
        System.out.println("Invoquem el mètode genèric amb arguments Varargs que mostrarem per pantalla.");
        System.out.println("\nProvarem primer amb dos arguments: una llista de tipus String i una altra de tipus File:");
        GenericMethods.consolePrint1(cadenes, files);
        System.out.println("Invoquem el mateix mètode, passant-li ara 4 arguments: els anteriors, més un objecte Persona i un Integer");
        GenericMethods.consolePrint1(cadenes, 78, files, person1);
        System.out.println("Comprovem que es mostren per consola els arguments passats com a paràmetre, independentment de la seva quantitat.");
    }
}
