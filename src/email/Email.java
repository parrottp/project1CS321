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
    private String signature;
    private List<String> recipient;
    private List<String> carbonCopy;
    private List<String> blindCarbonCopy;
    
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
    * Sets carbonCopy equal to input parameters
    * @param bcc 
    */
   public void setBCC(List<String> bcc)
   {
       blindCarbonCopy = bcc;
   }
   
   /**
    * @return carbonCopy
    */
   public List<String> getBCC()
   {
       return blindCarbonCopy;
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
    * Sets messageBody equal to input parameters
    * @param s
    */
   public void setSignature(String s)
   {
       signature = s;
   }
   
   /**
    * @return messageBody
    */
   public String getSignature()
   {
       return signature;
   }
   
   /**
    * Creates time stamp using Date object. This is used 
    * as a unique identifier.
    * @return timeStamp
    */
   public Date timeStamp()
   {
       Date timeStamp = new Date();
       return timeStamp;
   }
   /**
    * Prints out parts of email object. 
    */
   public void printEmail()
   {
       
       System.out.println("----------------------------------------------");
       System.out.println("[Sender]\n" + sender);
       System.out.println("----------------------------------------------");
       System.out.println("[Recipients]");
       recipient.forEach((r) ->
        {
            System.out.println(r);
        });
       System.out.println("----------------------------------------------");
       System.out.println("[CC]");
       carbonCopy.forEach((c) ->
        {
            System.out.println(c);
        });
       System.out.println("----------------------------------------------");
       System.out.println("[BCC]");
       blindCarbonCopy.forEach((b) ->
        {
            System.out.println(b);
        });
       System.out.println("----------------------------------------------");
       System.out.println("[Subject]\n" + subject);
       System.out.println("----------------------------------------------");
       System.out.println("[Message Body]\n" + messageBody);
       System.out.println(signature);
       System.out.println("----------------------------------------------");
       System.out.println("Date and Time: " + timeStamp().toString());
       System.out.println("----------------------------------------------");
   }   
}
