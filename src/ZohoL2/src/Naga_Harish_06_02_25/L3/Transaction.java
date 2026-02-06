package ZohoL2.src.Naga_Harish_06_02_25.L3;

public class Transaction {
    int id;
    String cardNo;
    int amountTransacted;

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", cardNo='" + cardNo + '\'' +
                ", amountTransacted=" + amountTransacted +
                '}';
    }

    public Transaction(int id, String cardNo, int amountTransacted) {
        this.id = id;
        this.cardNo = cardNo;
        this.amountTransacted = amountTransacted;
    }
}
