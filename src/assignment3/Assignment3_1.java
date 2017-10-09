package assignment3; // package declaration is compulsory.
/*
 This program will help you understand the concepts of Class and Instance variables.
 */
class Variables
{
	// class variables declaration
	static int myInt=100;
	static String myString="Java";
	
	// instance variables declaration
	
	int instanceInt=150;
	String instanceString="Instance";
	
}

public class Assignment3_1
{

	public static void main(String[] args) // main method starts
	{
		// TODO Auto-generated method stub
		
		// creating object of variables class
		Variables obj=new Variables();
		Variables obj1=new Variables();
		
		// Accessing class variables via class name
		System.out.println(Variables.myInt);
		System.out.println(Variables.myString);
		
		obj.myInt=101; // assigning new value to class variable
		
		/* printing the values for class variables,both objects will have same value for myInt variable 
 		   as same copy is given to all the objects
		 */
		System.out.println(obj.myInt);
		System.out.println(obj.myString);
		
		System.out.println(obj1.myInt);
		System.out.println(obj1.myString);

		
		obj.instanceString="New Instance Value"; // assigning new value to instance variable through first object i.e. obj
		
		// printing the values for instance variables,both objects will have different value
		
		System.out.println(obj.instanceInt);
		System.out.println(obj.instanceString);
		
		System.out.println(obj1.instanceInt);
		System.out.println(obj1.instanceString);
	}

}
