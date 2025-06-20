package Operators;

public class InventoryManagement {

    public static void main(String[] args) {
        
        String productName = "Moblie";
        byte productQuantity = 9;
        double unitPrice = 4500.50;
        boolean reorder = true;
        boolean safe = true;


        double total = unitPrice * productQuantity;
        boolean reorderThreshold = productQuantity > 6;
        boolean available = productQuantity > 6 || safe == true;
        productQuantity--;

        System.out.println("productName is " + productName);
        System.out.println("totalvalueinstock is " + total);
        System.out.println("productquatityisbelowreorderthreshold is " + reorderThreshold);
        System.out.println("issufficientandproductismarkedforsale is " + available);
        System.out.println("productQuantity is " + productQuantity);

    }
}
