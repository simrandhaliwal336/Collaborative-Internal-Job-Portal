import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Registration {
	public static String userName;
	public static String passWord;
	public static void submitDetails()
	{
		String input="";
		System.out.print("Registration\n\n");
		System.out.print("Enter The Details Of Post\n");
		System.out.print("Username:");
		userName=stringInsertion();
		System.out.print("Password:");
		passWord=stringInsertion();
		System.out.print("Company Name:");
		String companyName = stringInsertion();
		System.out.print("\nEligibility:");
		String eligibility = stringInsertion();
		System.out.print("\nLocation");
		String location=stringInsertion();
		System.out.print("\nPackage");
		int package1=intInsertion();
		System.out.print("\nNo. Of Vacancies:");
		int vacancies=intInsertion();
		System.out.print("\nBatch");
		int Batch=intInsertion();
		System.out.print("\nLast Date To Apply");
		int lastDate=intInsertion();
		System.out.print("\nSelect:\n");
		System.out.print("\n00: Resumit The Details\n");
		System.out.print("\n01: Submit\n");
		int submit=intInsertion();
		if(submit==0)
		{
			submitDetails();
		}
		if(submit==1)
		{
			System.out.println("The Details Has Been Successfully Saved.");
		}
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
} 