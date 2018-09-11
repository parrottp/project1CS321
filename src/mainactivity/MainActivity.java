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
   private static String sender;
   private static String messageBody;
   
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
               "payton.r.parrott@saic.com", "generic@email.com");
       carbonCopylist = Arrays.asList("nbw0067@uah.edu","hello@uah.edu");
       messageBody = "Hey Guys, \n" + "This is a test for the email class.\n" + 
               "Thanks,\n" + "Payton Parrott";
   
       //Inputing data into email object
       email.setSender(sender);
       email.setRecipient(recipientList);
       email.setCC(carbonCopylist);
       email.setMessageBody(messageBody);
       
       //printing email object
       email.printEmail();
    }
}
