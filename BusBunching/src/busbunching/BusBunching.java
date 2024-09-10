
package busbunching;
import java.util.Scanner;

class Drivers {
    protected String name;
    protected String IDnumber;
    protected String username;
    protected String password;
    
    Scanner scnr1 = new Scanner(System.in);
    
public void driversRegistertation() {
    System.out.println("Registration page!");
    System.out.println("Please, enter your name: ");
    name = scnr1.nextLine();
    System.out.println("Please, enter your username: ");
    username = scnr1.nextLine();
    System.out.println("Please, enter your password: ");
    password = scnr1.nextLine();
    
    
}
}

class LoginForDrivers extends Drivers {
    Scanner scnr = new Scanner(System.in);
    protected String username1;
    protected String password1;
    
    public void setUsername(String newUsername) {
        username1 = newUsername;
    }
    public void setPassword(String newPassword) {
        password1 = newPassword;
    }
    
    public String getUsername() {
        return username1;
    }
    public String getPassword() {
        return password1;
    }
    
    public void Login() {
        System.out.println();
        System.out.println("Log in");
        System.out.print("Please, enter your username: ");
        username1 = scnr.nextLine();
        System.out.println("Please, enter your password: ");
        password1 = scnr.nextLine();
        
        if (username.equals(username1) && password.equals(password1)) {
            System.out.println("You have successfuly logged in!");
        }
        else {
            System.out.println("Login failed!");
        }
    }
}
public class BusBunching {

    public static void main(String[] args) {
        LoginForDrivers d1 = new LoginForDrivers();
        
        d1.driversRegistertation();
        System.out.println("______________________________");
        d1.Login();
        System.out.println("______________________________");
        
        DriversInstructions case1 = new DriversInstructions(8.6, 13);
        
        case1.distancesBtwBusses();
        
    }
    
}
