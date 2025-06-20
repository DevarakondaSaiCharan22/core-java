package CRM;

public class CustomerDiscountCalculation {

    public static void main(String[] args) {
        
        int customerId  = 402;
        String customerName = "Ramesh";
        boolean isPremium = true;
        byte yearsPartnership = 5;
        String dealStage = "Closed";
        double dealValue = 4500.00;

        double baseDiscount = isPremium ? 0.10 : (yearsPartnership >= 3 ? 0.05 : 0.0);
        double discount = 0.0;

        switch (dealStage) {
            case "Proposal":
                discount +=0.2;
                break;
            case "Negotiation":
            discount +=0.03;
            break;
            case "Closed":
            discount +=0.03;
            break;

            default:
            discount +=0;
                break;
        }

    double totalDiscount = baseDiscount + discount;
    double finalDealValue = dealValue - (dealValue * totalDiscount);


        System.out.println("Customer Id        :"+customerId);
        System.out.println("Customer Name      : "+customerName);
        System.out.println("Base Discount      : " + (baseDiscount * 100));
        System.out.println("Extra Discount     : " + (discount * 100));
        System.out.println("Total Discount     : " + (totalDiscount * 100));
        System.out.println("Final Deal Value   : " + finalDealValue); 
       


    }
}
