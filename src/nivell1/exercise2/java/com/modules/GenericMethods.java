package nivell1.exercise2.java.com.modules;

public class GenericMethods {

    public static <T> void consolePrint(T arg0, T arg1, T arg2){
        System.out.println("Primer argument --> " + arg0);
        System.out.println("Segon argument --> " + arg1);
        System.out.println("Tercer argument --> " + arg2);
    }
}
