package Zoho_3rd_round.TaxiBooking;

public class Driver {
    private int id;
    private String name;
    private int password;
    private int age;

    private int earnings;

    private boolean isRest=false;

    public boolean isRest() {
        return isRest;
    }

    public void setRest(boolean rest) {
        isRest = rest;
    }

    public int getEarnings() {
        return earnings;
    }

    public void setEarnings(int earnings) {
        this.earnings = earnings;
    }



    private String loc;

    public int getId() {
        return id;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
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
public Driver(){

}
    public Driver(int id, String name, int password, int age,String loc) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.loc=loc;

    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ",Location= "+loc;
    }
}
