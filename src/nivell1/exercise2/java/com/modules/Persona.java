package nivell1.exercise2.java.com.modules;

public class Persona {
    private String name;
    private String surname;
    private int age;

    public Persona(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
