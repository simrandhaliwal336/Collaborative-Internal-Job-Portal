import java.util.Scanner;

public class Registration_Student {
	public static String userName_Student;
	public static String passWord_Student;
	public static void submitDetails_reg_student()
	{
		submitDetails_Student();
		selection();
	}
	public static void submitDetails_Student()
	{
		
		System.out.print("Registration\n\n");
		System.out.print("Enter The Details \n");
		System.out.print("\nUsername:");
		userName_Student=stringInsertion();
		System.out.print("Password:");
		passWord_Student=stringInsertion();
		System.out.print("\nName:");
		String Name = stringInsertion();
		System.out.print("\nHighest Qualification:");
		String H_Q = stringInsertion();
		System.out.print("\nHighest Qualification Percentage(in%):");
		int H_Q_percentage=intInsertion();
		System.out.print("\nExpected Package(in lac):");
		int E_package=intInsertion();
		System.out.print("\nBatch");
		int batch=intInsertion();
		System.out.print("\nSelect:\n");
		System.out.print("\n00: Resumit The Details\n");
		System.out.print("\n01: Submit\n");
	}
	public static String stringInsertion()
	{
		String input="";
		Scanner in=new Scanner(System.in);
		input = in.next();
		return input;
	}
	public static int intInsertion()
	{				
	
		int input=0;
		Scanner in=new Scanner(System.in);
		while(!in.hasNextInt())
		{
				System.out.println("Please Enter Numeric Values");
				in.hasNext();
		}
				input=in.nextInt();
				return input;
	}
	public static void selection()
	{
		int submit = intInsertion();
		if(submit==0)
		{
		submitDetails_Student();	
		}
		else if(submit==1)
		{
			System.out.println("The Details Have Been Succesfully saved:");
	
		}
		else
		{
			System.out.println("Please Enter The Correct Option:");
			selection();
		}
	}
}
