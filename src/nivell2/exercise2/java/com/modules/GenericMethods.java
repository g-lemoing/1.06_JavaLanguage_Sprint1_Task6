package nivell2.exercise2.java.com.modules;

import java.util.Arrays;

public class GenericMethods {

    @SafeVarargs
    public static <T> void consolePrint1(T... arg){
        System.out.println(Arrays.toString(arg));
    }
}
