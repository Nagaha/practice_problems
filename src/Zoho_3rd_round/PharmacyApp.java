package Zoho_3rd_round;

import java.util.*;

public class PharmacyApp {
    private List<Map<String,Object>> branches;
    private List<Map<String,Object>> customer;
    private List<Map<String,Object>> stock;
    private List<Map<String,Object>> transactions;

    private List<Map<String,String>>  alternateProduct;


    int transactionCount=1;

    PharmacyApp(){
        branches=new ArrayList<>();
        customer=new ArrayList<>();
        transactions=new ArrayList<>();
        stock=new ArrayList<>();
        alternateProduct=new ArrayList<>();

    }

    public static void main(String[] args) {
        PharmacyApp pharmacy=new PharmacyApp();
        Scanner sc=new Scanner(System.in);
        int choice;
        System.out.println("\n1.Add Branch");
        System.out.println("2.Add Stock");
        System.out.println("3.Associate Alternate Products");
        System.out.println("4.Add customer");
        System.out.println("5.show Summary");
        System.out.println("6.Purchase products ");

        System.out.print("Enter your choice: ");
        choice=sc.nextInt();
        switch (choice){
            case 1:
            {
                System.out.println("Enter the branch id: ");
                int branchId=sc.nextInt();
                System.out.println();
                System.out.println("Enter the branch location: ");
                String loc=sc.next();
                System.out.println("Enter the branch number: ");
                long branchNum=sc.nextLong();
                pharmacy.addBranch(branchId,loc,branchNum);

                break;
            }
            case 2:{
                System.out.println("Enter the branch id: ");
                int branchId=sc.nextInt();
                System.out.println();
                System.out.println("Enter medicine name: ");
                String medicinie=sc.next();
                System.out.println();
                System.out.println("Enter the quantity: ");
                int qty=sc.nextInt();
                System.out.println("Enter price: ");
                int price=sc.nextInt();

                int OneProduct=price/qty;

                pharmacy.addStock(branchId,medicinie,price,OneProduct,qty);
                break;
            }
        }


    }

    private void addStock(int branchId, String medicinie, int price, int oneProduct, int qty) {
        Map<String,Object> newStock=new HashMap<>();
        newStock.put("BranchId",branchId);
        newStock.put("Medicine",medicinie);
        newStock.put("Price",price);
        newStock.put("PricePerProduct",oneProduct);
        newStock.put("Quantity",qty);

        stock.add(newStock);
        printStockSummary();
    }



    private void addBranch(int branchId, String loc, long branchNum) {
        Map<String,Object> newBranch=new HashMap<>();
        newBranch.put("BranchId",branchId);
        newBranch.put("Location",loc);
        newBranch.put("MobileNumber",branchNum);

        branches.add(newBranch);
        printBranchSummary();
    }

    private void printBranchSummary() {
        System.out.println("Branch Id              Branch Location            Phone number");
        System.out.println("-------------------------------------------------------------");
        for (Map<String,Object> branch:branches){
            System.out.printf("%s           |         %s                |      %d             ",
                    branch.get("BranchId"),branch.get("Location"),branch.get("MobileNumber"));
            System.out.println();
            System.out.println("-------------------------------------------------------------");
        }
    }
    private void printStockSummary() {
        System.out.println("Branch Id               Medicine Name            Quantity           Price");
        System.out.println("----------------------------------------------------------------------------");
        for(Map<String,Object> st:stock){
            System.out.printf("%d           |     %s                   |    %d            |      %d         ",
                    st.get("BranchId"),st.get("Medicine"),st.get("Quantity"),st.get("Price"));
            System.out.println("");
            System.out.println("---------------------------------------------------------------------------");
        }
    }

}
