package Zoho_3rd_round;

import java.util.ArrayList;

public class Branch {
    private int branchId;
    public String branchLocation;
    private long phoneNumber;

    public Branch(int branchId, String branchLocation, long phoneNumber) {
        this.branchId = branchId;
        this.branchLocation = branchLocation;
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<Medecine> availableStock;

}
