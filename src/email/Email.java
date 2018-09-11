/**
 * Email Class: Handles all of the parts of the email object
 * 
 */
package email;
import java.util.*;


public class Email 
{
    private String sender;
    private String messageBody;
    private List<String> recipient;
    private List<String> carbonCopy;
    
   /**
    * Set sender equal to input parameters
    * @param s sender string
    */
   public void setSender(String s)
   {
        sender = s;
   }
   
   /**
    * @return sender
    */
   public String getSender()
   {
       return sender;
   }
   
   /**
    * Sets recipient equal to input parameters
    * @param r recipient list
    */
   public void setRecipient(List<String> r)
   {
       recipient = r;
   }
   
   /**
    * @return recipient
    */
   public List<String> getRecipient()
   {
       return recipient;
   }
   
   /**
    * Sets carbonCopy equal to input parameters
    * @param cc 
    */
   public void setCC(List<String> cc)
   {
       carbonCopy = cc;
   }
   
   /**
    * @return carbonCopy
    */
   public List<String> getCC()
   {
       return carbonCopy;
   }
   
   /**
    * Sets messageBody equal to input parameters
    * @param mb 
    */
   public void setMessageBody(String mb)
   {
       messageBody = mb;
   }
   
   /**
    * @return messageBody
    */
   public String getMessageBody()
   {
       return messageBody;
   }
   
   /**
    * Prints out information for email object
    */
   public void printEmail()
   {
       System.out.println("Sender: " + sender);
       
       System.out.println("[Recipients]");
       for (String r : recipient)
       {
           System.out.println(r);
       }
       System.out.println("[CC]");
       for (String c: carbonCopy)
       {
           System.out.println(c);
       }
       System.out.println("[Message Body]\n" + messageBody);
   }   
}