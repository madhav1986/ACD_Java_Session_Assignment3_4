package assignment3; // package declaration is compulsory.
/*
 This program will help to understand the concepts of Constructor chaining,super and this keyword.
 */

//creating parent class
class Parent
{
	Parent()
	{
		System.out.println("This is Default constructor of parent class"); // this will call the default constructor of class
	}
	
	Parent(String name)
	{
		this("madhav","delhi"); // this will call the parameterized constructor of the same class
		System.out.println("This is constructor of parent class with one parameter");
	}
	Parent(String name,String address)
	{
		System.out.println("This is constructor of parent class with two parameters");
		System.out.println("Name="+name+" "+"Address="+address);
	}
}

public class Assignment3_3 extends Parent
{
	Assignment3_3()
	{
		this("hello"); // this will call the parameterized constructor of the same class with one parameter.
		System.out.println("This is Default constructor of child class");
	}
	
	Assignment3_3(String name)
	{
		super("hello"); //this will call the parameterized  constructor of parent class with one parameter. 
		System.out.println("This is constructor of child class with one parameter");
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Assignment3_3 obj =new Assignment3_3(); //creating object of this class to call the Default constructor.
		
	}
	
}

