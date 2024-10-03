package nivell2.exercise2.java.com.modules;

import java.util.ArrayList;

public class GenericMethods {

    public static <T, U, V> void consolePrint(ArrayList<T> arg0, ArrayList<U> arg1, ArrayList<V> arg2){
        System.out.println("Primer argument --> " + arg0);
        System.out.println("Segon argument --> " + arg1);
        System.out.println("Tercer argument --> " + arg2);
    }

}
