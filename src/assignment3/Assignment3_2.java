package assignment3;// package declaration is compulsory.

/*
 This program will help you to master the concepts of Super and this keyword.
 */
class Parentclass //parent class
{
	
	//Declare variables
	int num=50;
	int empno;
	String ename;
	
	//Use of this keyword for variables
	void EmpDetails(int empno,String ename)
	{
		this.empno=empno;
		this.ename=ename;
		System.out.println(empno+" "+ename);
	}
	
	void display()
	{
		System.out.println("Displaying parent class display method message....");
	}
	
	void GetName()
	{
		System.out.println("Parent class Getname Method");
	}
	
	// overloaded constructor with one parameter
	Parentclass(int x)
	
	{
		//use of this keyword with constructor
		this(10,20);
		System.out.println("Parent Class constructor "+x);
	}
	
	// overloaded constructor with two parameters
	Parentclass(int a,int b)
	{
		
		System.out.println("sum of two numbers="+(a+b));
	}

}


class Subclass extends Parentclass // Subclass inheriting Parentclass
{

	int num=100;
	
	// use of super Keyword with constructor
	Subclass()
	{
		//call to parent class overloaded constructor with one parameter
		super(10);
		
	}
	
	// use of super keyword for method
	void display()
	{
		super.display();
		System.out.println("Hi");
	}
	
	// use of super keyword for variable
	void printNumber()
	{
	      System.out.println("Parent class Integer="+super.num);
	 }
	
	void GetName()
	{
		System.out.println("Child class Getname Method");
	}
	
	// use of this keyword to access method of current class
	void GetNameDisp()
	{
		this.GetName();
	}
	
}
public class Assignment3_2
{
	public static void main(String[] args) // main method starts
	{
		Subclass obj = new Subclass(); //object of child class
		obj.printNumber();
		obj.display();
		obj.EmpDetails(10, "Madhav");
		obj.GetNameDisp();
		
	}

}
