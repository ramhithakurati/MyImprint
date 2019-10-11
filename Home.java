
import java.util.Scanner;
import java.net.*;
import java.io.*;
import java.util.ArrayList;
/**
 * Write a description of class Home here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Home
{
    public static void main(String[] args) throws Exception
    {
        //asks user id they have a myImpact account
        System.out.println("Do you have a myImprint account(y or n):");
        Scanner a = new Scanner(System.in);
        String acc = a.nextLine();
        if (acc.equals("n")) 
        {
            // prompt user to create account if they dont have one
            createAccount();
        }
        else
        {
            //prompt user to type in account information 
            System.out.println("Enter your username:");
            Scanner u = new Scanner(System.in);
            String username = u.nextLine();
            System.out.println("Enter your password:");
            Scanner p = new Scanner(System.in);
            String password =p.nextLine();
        }
        // creates a URLReader object
        URLReader webpages = new URLReader();
        System.out.println(webpages);
    }
    
    //creates the account object
    public static void createAccount()
        {
            System.out.println("Enter your username:");
            Scanner u = new Scanner(System.in);
            String username = u.nextLine();
            System.out.println("Enter your password:");
            Scanner p = new Scanner(System.in);
            String password = p.nextLine();
            Account a1 = new Account(username, password);           
        }

            
}