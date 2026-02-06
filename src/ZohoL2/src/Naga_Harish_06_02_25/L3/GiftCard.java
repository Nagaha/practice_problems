package ZohoL2.src.Naga_Harish_06_02_25.L3;

public class GiftCard {

     String cardId;
    int pin;
     int cardBalance;
     String status;
    Customer cardHolder;
    int rewardPoints;
    String cardType="";
    public GiftCard(String cardId, int pin, int cardBalance,String status, Customer cardHolder) {
        this.cardId = cardId;
        this.pin = pin;
        this.cardBalance = cardBalance;
        this.cardHolder = cardHolder;
        this.status=status;
        this.cardType="Silver";
    }

    @Override
    public String toString() {
        return "{" +
                "cardId='" + cardId + '\'' +
                ", pin=" + pin +
                ", cardBalance=" + cardBalance +
                ", status='" + status + '\'' +
                ", cardHolder=" + cardHolder +
                ", rewardPoints=" + rewardPoints +
                ", cardType='" + cardType + '\'' +
                '}';
    }
}
