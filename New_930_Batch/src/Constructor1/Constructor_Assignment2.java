package Constructor1;

public class Constructor_Assignment2 
{
	
public Constructor_Assignment2 ()
	
	{
		
	this(22,34,34);
	
		System.out.println("default constructor");
		
	}

 
public Constructor_Assignment2 (int a, int b, int c)

{
   
	
	
	System.out.println("3 parameterized constructor");
	
}

public Constructor_Assignment2 (int a)

{
	
	this();

	System.out.println("1 parameterized constructor");
	
}

public Constructor_Assignment2 (int a, int c)

{
	
	this(1);

	System.out.println("2 parameterized constructor");
	
}

public Constructor_Assignment2 (int a, int c, int d, int r)

{
	
	this(1,2);

	System.out.println("4 parameterized constructor");
	
}

public static void main(String[] args) 
{
	
	Constructor_Assignment2 obj1 = new Constructor_Assignment2(3,1,3,2);
	
}



}
