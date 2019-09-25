import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Registration {
	public static void main(String args[])
	{
		submitDetails();
	}
	public static void submitDetails()
	{
		
		String input="";
		System.out.println("Registration\n\n");
		System.out.println("Enter The Details Of Post\n");
		System.out.println("Company Name:");
		String companyName = stringInsertion();
		StringCheck(companyName);
		System.out.println("\nEligibility:");
		String eligibility = stringInsertion();
		System.out.println("\nLocation");
		String location=stringInsertion();
		System.out.println("\nPackage");
		int package1=intInsertion();
		System.out.println("\nNo. Of Vacancies:");
		int vacancies=intInsertion();
		System.out.println("\nBatch");
		int Batch=intInsertion();
		System.out.println("\nLast Date To Apply");
		int lastDate=intInsertion();
		System.out.println("\nSelect:\n");
		System.out.println("\n00: resumit The Details\n");
		System.out.println("\n01: Submot\n");
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
		Scanner sc=new Scanner(System.in);
		input = sc.next();
		return input;
	}
	public static int intInsertion()
	{
		int input=0;
		Scanner sc=new Scanner(System.in);
		input=sc.nextInt();
		return input;
	}
	public static boolean intcheck(int input)
	{
		boolean bool=false;
		if(input.hasNextInt()==true)
		{
			bool=input.hasNextInt;
		}
	}
	public static boolean stringCheck(String input)
	{
		boolean bool=false;
		if(input.hasNextString()==true)
			bool=true;
	}
} 