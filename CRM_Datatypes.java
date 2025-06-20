import java.time.LocalDate;

public class CRM_Datatypes {
   
    public static void main(String[] args) {
        Crm_CustomerDetails();
        Crm_Sales_Lead();
        CRM_Support_Ticket_Details();
        CRM_Interaction_Details();
        CRM_Sales_Opportunity_Details();

    }

    static void Crm_CustomerDetails(){
        byte customerId = 20;
        String customerName = "Remo";
        String customerLocation = "KNR";
        int customerNumber = 843423425;
        String customeemail = "remo23294@gmail.com";
        char sex ='M';
       
         System.out.println("----- Customer -----");
        System.out.println("Customer ID :" + customerId);
        System.out.println("Customer Name :" + customerName);
        System.out.println("Customer Location :" + customerLocation);
        System.out.println("Customer  Mobile Number :" + customerNumber);
        System.out.println("Customer email :" + customeemail);
        System.out.println("Gender :" + sex);
    }


    static void Crm_Sales_Lead(){

        int leadId = 201;
        String SalesLeadName = "Rahul";
        String SalesLeadcontactEmail = "rahul12@gmail.com";
        String SalesLeadcontactNumber = "933535252363";
        String SalesLeadsource = "Website";
        String SalesLeadstatus = "Old";

        System.out.println("----- Sales Lead -----");
        System.out.println("Lead ID: " + leadId);
        System.out.println("Customer Name: " + SalesLeadName);
        System.out.println("Email: " + SalesLeadcontactEmail);
        System.out.println("Phone: " + SalesLeadcontactNumber);
        System.out.println("Source: " + SalesLeadsource);
        System.out.println("Status: " + SalesLeadstatus);
    }


    static void CRM_Interaction_Details() {
        int interactionId = 78;
        int InteractioncustomerId = 408;
        String interactionType = "Email";
        String InteractionNotes = "Follow-up on product demo";
        String InteractionHandledBy = "Sales Executive";

        System.out.println("----- Interaction -----");
        System.out.println("Interaction ID: " + interactionId);
        System.out.println("Customer ID: " + InteractioncustomerId);
        System.out.println("Type: " + interactionType);
        System.out.println("Notes: " + InteractionNotes);
        System.out.println("solved By: " + InteractionHandledBy);
        System.out.println();
    }

    static void CRM_Sales_Opportunity_Details() {
        int opportunityId = 401;
        int customerId = 234;
        float value = 490.0f;
        String stage = "Negotiation";
        String status = "Open";

        System.out.println("----- Sales Opportunity -----");
        System.out.println("Opportunity ID: " + opportunityId);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Value: ₹" + value);
        System.out.println("Stage: " + stage);
        System.out.println("Status: " + status);
    }

    static void CRM_Support_Ticket_Details() {
        int SupportTicketId = 501;
        int SupporCustomerId = 101;
        String SupportIssueType = "High";
        String SupportDescription = "product issue";
        String SupportStatus = "Open";
        LocalDate createdDate = LocalDate.of(2025, 6, 10);

        System.out.println("----- Support Ticket -----");
        System.out.println("Ticket ID: " + SupportTicketId);
        System.out.println("Customer ID: " + SupporCustomerId);
        System.out.println("Issue Type: " + SupportIssueType);
        System.out.println("Description: " + SupportDescription);
        System.out.println("Status: " + SupportStatus);
        System.out.println("Created On: " + createdDate);
    }

}
