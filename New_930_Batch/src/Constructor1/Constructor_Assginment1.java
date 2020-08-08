package Constructor1;



public class Constructor_Assginment1 

{
	
public Constructor_Assginment1 ()
	
	{
		
	this(22,34,34,45);
	
		System.out.println("default constructor");
		
	}

 
public Constructor_Assginment1 (int a, int b, int c, int d)

{
   
	
	System.out.println("4 parameterized constructor");
	
}
    
public Constructor_Assginment1 (int a)

{

	this();
	System.out.println("1 parameterized constructor");
	
}
   
public Constructor_Assginment1 (int a, int b)

{

	this(1);
	System.out.println("2 parameterized constructor");
	
}

public Constructor_Assginment1 (int a, int b, int c)

{

	this(1,2);
	System.out.println("3 parameterized constructor");
	
}
   public static void main(String[] args) 
   
   {
	   
	   Constructor_Assginment1 obj = new Constructor_Assginment1(12,23,34);
	   
	   
	
}

}
