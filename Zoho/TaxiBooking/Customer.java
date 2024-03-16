package Zoho_3rd_round.TaxiBooking;

public class Customer {
    public static int currentCustomerId=4;
    private int id;
    private String name;
    private int password;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Customer() {

    }

    public Customer(int id, String name, int password, int age) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
    }
}
