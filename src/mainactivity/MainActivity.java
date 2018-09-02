/**
 * MainActivity 
 */
package mainactivity;
import java.util.Scanner;
import emailclient.EmailClient;
import java.io.*;
/**
 *
 * @author Payton Parrott
 */
public class MainActivity 
{
   public static EmailClient emailclient;
   public static String[] messagebody;
   
    public static void main(String[] args) throws IOException 
    {
       emailclient.messageBody(messagebody);
        
    }
}
