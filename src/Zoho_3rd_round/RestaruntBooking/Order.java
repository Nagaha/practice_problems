package Zoho_3rd_round.RestaruntBooking;

public class Order {
    String restaruntName;
    int quantity;
    String dishName;
    int price;

    @Override
    public String toString() {
        return "Order{" +
                "restaruntName='" + restaruntName + '\'' +
                ", quantity=" + quantity +
                ", dishName='" + dishName + '\'' +
                ", price=" + price +
                '}';
    }

    public Order(String restaruntName, int quantity, String dishName, int price) {
        this.restaruntName = restaruntName;
        this.quantity = quantity;
        this.dishName = dishName;
        this.price = price;
    }

}
