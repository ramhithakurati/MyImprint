import java.net.*;
import java.io.*;
import java.util.ArrayList;
/**
 * Write a description of class URLReader here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class URLReader {
    private String sites = "";
    public URLReader() throws Exception
        {
        
        // Gets the API from the URL
        URL api = new URL("https://haveibeenpwned.com/api/breachedaccount/test%40example.com");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(api.openStream()));

        // anything that flags the username as present at that site is added to inputLine
        String inputLine;
        while ((inputLine = in.readLine()) != null){
            System.out.println("Your email has been compromised!");
            sites = inputLine;
        }
        in.close();
    }
    
    //set sites to the String s
    public void setSites(String s)
    {
        sites = s;
    }
    
    //get sites
    public String getSites()
    {
        return sites;
    }
    
    //toString method to print output
    public String toString()
    {
        return "Sites you have been compromised on: \n" + sites;
    }
}