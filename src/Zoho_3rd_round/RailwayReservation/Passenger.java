package Zoho_3rd_round.RailwayReservation;

public class Passenger {
    String Name;
    int age;
    String status;
    char berth_preference;
    int id;

    public Passenger(String name, int age, char berth_preference) {
        Name = name;
        this.age = age;
        this.berth_preference = berth_preference;
    }

    public Passenger() {
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                ", status='" + status + '\'' +
                ", berth_preference=" + berth_preference +
                ", id=" + id +
                '}';
    }
}
