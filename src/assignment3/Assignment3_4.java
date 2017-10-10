package assignment3; // package declaration is compulsory.
import java.util.Scanner; // importing utility package
/*
 This program will help you understand the concepts of Methods,Constructors,Inheritance,Encapsulation.
 */
class Student // Student class having details of student
{
	// private variable declaration
	private String name;
	private String phoneNumber;
	private int rollNo;
	private int className;
	
    //Getter Methods
    public String getName()
    {
        return name;
    }

    public String getPhoneNum()
    {
        return phoneNumber;
    }

    public int getRollNo()
    {
        return rollNo;
    }

    public int getClassn()
    {
        return className;
    }

    // Setter methods
    public void setName(String newValue)
    {
    	name = newValue;
    }

    public void setPhoneNum(String newValue)
    {
    	phoneNumber = newValue;
    }

    public void setRollNo(int newValue)
    {
        rollNo = newValue;
    }
    
    public void setClassn(int newValue)
    {
        className = newValue;
    }
    
    public String result(float physics,float chemistry,float maths,int rollno) // result method to calculate result of student
    {
    	float total=(physics+chemistry+maths)/3; // calculating average 
    			
    			if(total > 35) // condition for deciding the result of student
    			
    				return "Pass";
    			else
    				return "fail";  			
    }

}

class StudentResultProcesing extends Student // StudentResultProcesing class extending Student class 
{

}

class Assignment3_4 
{
	public static void main(String[] args) // main method starts
	{
	
		StudentResultProcesing s=new StudentResultProcesing(); // creating object of base class(StudentResultProcesing)
		
		Scanner input=new Scanner(System.in); // scanner to take input from the user.
		System.out.println("Enter the name ");
		String name=input.nextLine(); // Initializing student name
		
		System.out.println("Enter the Phone number ");
		String phoneNumber=input.nextLine(); // Initializing student phone number
		
		System.out.println("Enter the Roll Number ");
		int rollNo=input.nextInt(); // Initializing student roll number
		
		System.out.println("Enter the Class ");
		int className=input.nextInt(); // Initializing student class number
		
		System.out.println("Enter the marks in physics ");
		float physics=input.nextInt();  // Initializing marks of physics subject
		
		System.out.println("Enter the marks in chemistry ");
		float chemistry=input.nextInt(); // Initializing marks of chemistry subject
		
		System.out.println("Enter the marks in maths ");
		float maths=input.nextInt(); // Initializing marks of maths subject
		
		// TODO Auto-generated method stub
		
		// calling the setter methods
		s.setName(name); 
		s.setPhoneNum(phoneNumber);
		s.setRollNo(rollNo);
		s.setClassn(className);
		// printing the details of student along with the result
		System.out.println("Name of the student: "+s.getName());
		System.out.println("Phone Number: "+s.getPhoneNum());
		System.out.println("Roll Number: " +s.getRollNo());
		System.out.println("Class: "+s.getClassn());
		System.out.println("Result: "+s.result(physics, chemistry, maths, rollNo));
		input.close();

	}

	
}

