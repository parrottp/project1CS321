/**
 * MainActivity 
 * Project 1
 * Payton Parrott
 *
 */
package mainactivity;
import email.Email;
import java.util.*;


public class MainActivity 
{
   private static List<String> carbonCopylist;
   private static List<String> recipientList;
   private static List<String> blindCarbonCopy;
   private static String sender;
   private static String messageBody;
   private static String subject;
   private static String signature;
   
    /**
     * MainActivity for Projet 1
     * @param args input arguments
     */
    public static void main(String[] args) 
    {
       Email email = new Email();
       
       //Hard Coding Data for email object
       sender = "prp0005@uah.edu";
       recipientList = Arrays.asList("parrott26@gmail.com", 
               "payton.r.parrott@saic.com", "generic@email.com", "ieee@uah.edu");
       carbonCopylist = Arrays.asList("nbw0067@uah.edu","hello@uah.edu");
       blindCarbonCopy = Arrays.asList("ghg0004@uah.edu");
       subject = "Testing Email Class";
       messageBody = "Hey Guys, \n"
               + "This is a test email object. This object includes\n"
               + "a sender, recipients, carbon copy list, blind carbon\n"
               + "copy list a subject, a message body, and a signature.";
       signature = "Thanks,\n"
               + "Payton Parrott";
     
       //Inputing data into email object
       email.timeStamp();
       email.setSender(sender);
       email.setRecipient(recipientList);
       email.setCC(carbonCopylist);
       email.setBCC(blindCarbonCopy);
       email.setSubject(subject);
       email.setMessageBody(messageBody);
       email.setSignature(signature);
       
       //printing email object
       email.printEmail();
    }
}