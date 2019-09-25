import java.util.Scanner;
public class Login {

public static void main(String[] args) {
	Scanner var = new Scanner(System.in);

    String username;
    String password;

    System.out.println("Enter your username:");
    username = var.nextLine();

    System.out.println("password: ");
    password = var.nextLine();

    //users check = new users(username, password);

    if(username.equals(username) && password.equals(password)) 
    {
        System.out.println("You are logged in");
    }
        else
    {
    	System.out.println("You are not logged in");
    }
}

}
