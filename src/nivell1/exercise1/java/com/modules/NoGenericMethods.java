package nivell1.exercise1.java.com.modules;

public class NoGenericMethods {
    private String name;
    private String city;
    private String phone;

    public NoGenericMethods(String name, String city, String phone){
        this.name = name;
        this.city = city;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "NoGenericMethods{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
