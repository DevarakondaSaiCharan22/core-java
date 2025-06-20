package Operators;

public class StudentOperator {

    public static void main(String[] args) {
        
        int customerId = 102;
        String customerName  = "Sai";
        double totalPurchases = 322.05;
        int interactionCount = 678;

        int leadId  =409;
        double leadBudget = 500.50;
        boolean isContacted = true;

        double opportunityValue = 1500.75;
        boolean isClosed  = false;


        //arthemetic operators
        double average  = totalPurchases / interactionCount;

        //relational 
        boolean opportunity = opportunityValue > 5000;

       //logical 
     boolean shouldPrioritizeLead = (leadBudget > 3000) && !isContacted;


     interactionCount++;

        System.out.println("=================Customer Details====================");
        System.out.println("Customer ID"+customerId);
        System.out.println("Customer Name"+customerName);
        System.out.println("Interaction count "+interactionCount);
        System.out.println("=================lead status====================");
        System.out.println("leadId  "+leadId);
        System.out.println("leadBudget "+ leadBudget);
        System.out.println("isContacted "+ isContacted);
        System.out.println("=================opportunity checks====================");
        System.out.println(" The aaverage customers "+average);
        System.out.println("  sales opportunity "+opportunity);
        System.out.println(" shouldPrioritizeLead "+shouldPrioritizeLead);




    }
}
