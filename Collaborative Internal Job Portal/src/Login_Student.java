import java.util.Scanner;

public class Login_Student {
	public void loginDetails_Student()
	{
		 Registration reg = new Registration();
		 Scanner in = new Scanner(System.in);
		 String username=reg.userName;
		 String password=reg.passWord;
		 System.out.println("Enter The Details:\n\n");
		 System.out.println("Username: ");
		 String user = in.next();
		 System.out.println("password: ");
		 String pass = in.next();
		 Boolean check_user=checkDetails_user(user,username);
		 Boolean check_pass=checkDetails_pass(pass,password);

	}
	public static boolean checkDetails_user(String user, String username)
	{
		boolean bool_user=false;
	    if(user==username) 
	    {
	        bool_user=true;
	    }
	    return bool_user;
	}
	public static boolean checkDetails_pass(String pass, String password)
	{
		boolean bool_pass=false;
		if(pass==password)
		{
			bool_pass=true;
		}
		return bool_pass;
	}
}
