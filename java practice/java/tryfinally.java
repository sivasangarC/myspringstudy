import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class tryfinally{
    public static void main(String[] args) throws NumberFormatException {   
    	
    	int i=0;
    	int j=0;
    	try
    	{
    		j=18/i;
    		
    	}
    	catch(Exception e) // Catches any exception thrown in the try block
    	{
    		System.out.println("Someting went wrong.");
    		System.out.println("Bye");
    	}
    	finally // finally block ALWAYS runs — whether exception occurred or not
    	{
    		System.out.println("Bye");
    	}
    	
    	int num=0;
    	try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))) // try-with-resources: auto-closes br when done
    	{
    		num=Integer.parseInt(br.readLine()); // readLine() reads a full line of text, parseInt converts it to int
    		System.out.println(num);
    	}
    	finally // no need of finally in new java — try-with-resources handles closing automatically
    	{
    		//br.close();
    	}
    }
    
}

//code for exception throwing from the class

// class NavinException extends Exception
// {
// 	public NavinException(String string)
// 	{
// 		super(string);
// 	}
// }

// class A
// {
// 	public void show() throws ClassNotFoundException
// 	{
// //    	try
// //    	{
// //    		Class.forName("Calc");
// //    	}
// //    	catch(ClassNotFoundException e)
// //    	{
// //    		System.out.println("Not able to find theh class");
// //    	}
		
// 		Class.forName("Calc");
// 	}
// }

// public class Demo {
	
// 	static {
// 		System.out.println("Class Loader");
// 	}
	
//     public static void main(String[] args) {
    	
// //    	try
// //    	{
// //    		Class.forName("Class");
// //    	}
// //    	catch(ClassNotFoundException e)
// //    	{
// //    		System.out.println("Not able to find theh class");
// //    	}
    	
//     	A obj=new A();
//     	try {
//     		obj.show();
//     	}catch(ClassNotFoundException e)
//     	{
//     		e.printStackTrace();
//     	}
    	
    	
//     }
// }
