/**
 * Email Class: Handles all of the parts of the email message pieces
 * 
 */
package emailclient;


public class EmailClient 
{
    private String sender;
    private String messageBody;
    private String recipient;
    private String carbonCopy;
    
    
    
   public void setSender(String s)
   {
        sender = s;
   }
   
   public String getSender()
   {
       return sender;
   }
   
   public void setRecipient(String r)
   {
       recipient = r;
   }
   
   public String getRecipient()
   {
       return recipient;
   }
   
   public void setCC(String cc)
   {
       carbonCopy = cc;
   }
   
   public String getCC()
   {
       return carbonCopy;
   }
   
   public void setMessageBody(String mb)
   {
       messageBody = mb;
   }
   
   public String getMessageBody()
   {
       return messageBody;
   }
   
   public void printEmail()
   {
       System.out.println("Sender: " + sender);
       System.out.println("Recipient: " + recipient);
       System.out.println("CC: " + carbonCopy);
       System.out.println("\n");
       System.out.println("Message Body: " + messageBody);
   }
   
   
          
    
    
    
    
    
}
