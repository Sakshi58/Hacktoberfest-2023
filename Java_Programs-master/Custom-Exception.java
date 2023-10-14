import java.util.*;

class AgeException extends Exception						////Custom Exception 
{
	AgeException()							////class constructor 
	{
		System.out.println("under age problem");
	}
}

class customexceptionExample
{
	void func()
	{
		try
		{
			Scanner sc =new Scanner(System.in);
			System.out.println("enter the age : ");
			int age = sc.nextInt();
	
			if(age>=18)
			{
				System.out.println("vote done!!!");
			}
			else			
			{
				throw new AgeException();			///exception object creation
			}
		}
		catch(AgeException e)					///calling the exception
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("next voter will come !!!");
		}
	}
	public static void main(String args[])
	{
		customexceptionExample obj = new customexceptionExample();
		obj.func();
	}
}
