/**
 * Email Class: Handles all of the parts of the email message pieces
 * 
 */
package emailclient;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;




public class EmailClient 
{
    
   public void messageBody(String[] body) throws IOException
   {
        BufferedReader in = new BufferedReader(
            new InputStreamReader(System.in));
        
        String s;
 
        while ((s = in.readLine()) != null) 
        {
            System.out.println(s);
        }
   }
          
    
    
    
    
    
}
