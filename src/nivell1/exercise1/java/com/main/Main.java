package nivell1.exercise1.java.com.main;

import nivell1.exercise1.java.com.modules.NoGenericMethods;

public class Main {
    public static void main(String[] args) {
        System.out.println("Creem una instància de la classe NoGenericMethods passant els paràmetres en l'ordre nom, població, telèfon.");
        NoGenericMethods obj1 = new NoGenericMethods("Joan", "Barcelona", "123456789");
        System.out.println("Creem una instància de la classe NoGenericMethods passant els paràmetres en l'ordre població, telèfon, nom.");
        NoGenericMethods obj2 = new NoGenericMethods("Barcelona", "123456789", "Joan");
        System.out.println("Creem una instància de la classe NoGenericMethods passant els paràmetres en l'ordre telèfon, nom, població.");
        NoGenericMethods obj3 = new NoGenericMethods("123456789", "Joan", "Barcelona");
        System.out.println("Comprovem que les 3 instàncies s'han creat, encara que les dades que contenen poden ser incongruents:");
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);

    }
}
