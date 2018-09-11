/**
 * Email Class: Handles all of the parts of the email object
 */
package email;
import java.util.*;


public class Email 
{
    private String sender;
    private String messageBody;
    private String subject;
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
    * Set subject equals to input parameters
    * @param s 
    */
   public void setSubject(String s)
   {
       subject = s;
   }
   
   public String getSubject()
   {
       return subject;
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
    * Prints out parts of email object. Also prints out time stamp at the end
    */
   public void printEmail()
   {
       Date date = new Date();
       
       System.out.println("-----------------------------------------");
       System.out.println("[Sender]\n" + sender);
       System.out.println("-----------------------------------------");
       
       System.out.println("[Recipients]");
       recipient.forEach((r) ->
        {
            System.out.println(r);
        });
       System.out.println("-----------------------------------------");
       System.out.println("[CC]");
       
       carbonCopy.forEach((c) ->
        {
            System.out.println(c);
        });
       System.out.println("-----------------------------------------");
       System.out.println("[Subject]\n" + subject);
       System.out.println("-----------------------------------------");
       System.out.println("[Message Body]\n" + messageBody);
       System.out.println("-----------------------------------------");
       System.out.println("Date and Time: " + date.toString());
       System.out.println("-----------------------------------------");
       
   }   
}
