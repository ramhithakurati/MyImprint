import java.util.Scanner;
/**
 * Write a description of class account here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Account
{
    // instance variables for username and password
    private String username;
    private String password;
    
    public Account(String user, String pass)
    {
        // create username
        username = user;
        //create password
        password = pass;
        System.out.println("Here is your user name and password, please save it in a safe spot\nusername:" + username + "\npassword:" + password);
    }

    // sets the username to the input u
    public void setUser(String u)
    {
        username = u;
    }
    
    // Sets the password to the input p
    public void setPass(String p)
    {
        password = p;
    }

    // gets the user's username
    public String getUser(String u)
    {
        return u;
    }
    
    //gets the user's password
    public String getPass(String p)
    {
        return p;
    }   

}
