package MCA_ZOHO;

public class Passenger {
    int id;
    int age;
    String name;
    String berth_preference;
    String seat;//2U

    public Passenger(int id, int age, String name, String berth_preference, String seat) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.berth_preference = berth_preference;
        this.seat = seat;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", berth_preference='" + berth_preference + '\'' +
                ", seat='" + seat + '\'';
    }
}
