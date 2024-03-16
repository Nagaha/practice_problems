package Zoho_3rd_round.TaxiBooking;

public class Trip {
    private String src;
    private String des;
    private int customerId;
    private int commison;
    private int fare;

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getCommison() {
        return commison;
    }

    public void setCommison(int commison) {
        this.commison = commison;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    private int driverId;

    public Trip(String src, String des, int customerId, int commison, int fare, int driverId) {
        this.src = src;
        this.des = des;
        this.customerId = customerId;
        this.commison = commison;
        this.fare = fare;
        this.driverId = driverId;
    }

    @Override
    public String toString() {
        return
                "src='" + src + '\'' +
                ", des='" + des + '\'' +
                ", customerId=" + customerId +
                ", commison=" + commison +
                ", fare=" + fare ;
    }
    public String toCString() {
        return
                "src='" + src + '\'' +
                        ", des='" + des + '\'' +
                        ", CabId=" + driverId +
                        ", fare=" + fare ;
    }
}
