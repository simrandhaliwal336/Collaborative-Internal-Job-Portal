import java.util.*;
public class main {
	
	public static void main(String args[]){
		//Calling function to get details
	starting_info();
}
public static void starting_info()
//function definition to get the details from user
	{	
	System.out.println("WELCOME TO JOB PORTAL\n\n");
	System.out.println("Please Select The Options:\n ");
	System.out.println("1:Student\n");
	System.out.println("2:Company\n");
	selection_user();
	//Function calling for checking user background

	}
public static void selection_user()
//function definition checking whether user is Student or company HR
{
	Scanner in = new Scanner(System.in);
	int option1 =in.nextInt();
	switch(option1)
	{
	case 1:{
		//Calling function if user is student
		Student_reg_or_signin();
		break;
	}
	case 2:{
		//calling function if user is company
		Comapany_reg_or_sigin();
		break;
	}
	default:
	{
		//if user put wrong input
		in.close();
		System.out.println("Please Enter The Correct Option");
		// calling same function agin to gave choice to user to put correct input;
		selection_user();
	}
}
}
public static void Student_reg_or_signin()
{
	//function definition to select for registration or signin as Student
	System.out.println("1:Registration");
	System.out.println("2:Signin");
	Scanner in=new Scanner(System.in);
	int option2 = in.nextInt();
	//Selecting Student wants to register or signin
	switch(option2)
	{
	case 1:{
		Registration_student();
		break;
	}
	case 2:{
		Signin_student();
		break;
	}
	default:
	{
		//if student select wrong option
		System.out.println("Please Enter Correct Option");
		Student_reg_or_signin();
	}
	}
	in.close();
	}
public static void Registration_student() {
	//function definition for registering as a student using Registeration_Student.java file's
	Registration_Student reg1 = new Registration_Student();
	//calling function using object
	reg1.submitDetails_Student();
}
public static void Signin_student()
//function definition for sign as a Student using login_student.java file's function
{
	//calling function using object
	Login_Student log1=new Login_Student();
	log1.loginDetails_Student();
}

public static void Comapany_reg_or_sigin()
{
	System.out.println("1:Registration");
	System.out.println("2:Signin");
	Scanner in=new Scanner(System.in);
	int option2=in.nextInt();
	switch(option2)
	{
	case 1:{
		         Registration_company();
				break;
	}
	case 2:{
		Signin_company();
		break;
	}
	default:
	{
		in.close();
		System.out.println("Please enter The Correct Option");
		Comapany_reg_or_sigin();
	}
	
	}
}
public static void Registration_company()
{
	Registration reg2 = new Registration();
	reg2.submitDetails();
}
public static void Signin_company()
{
	Login log2 = new Login();
	log2.loginDetails();

}
}
