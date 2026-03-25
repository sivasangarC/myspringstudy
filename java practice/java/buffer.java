import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
class buffer{
    public static void main(String[] args) throws IOException{   	
    	
//    	System.out.println("Enter a number");
//    	int num=System.in.read();
//    	
//  	System.out.println(num);
//    	System.out.println(num-48);
    	
    	System.out.println("Enter a number");
    	
//    	InputStreamReader in=new InputStreamReader(System.in);
//    	BufferedReader bf=new BufferedReader(in);
    	
//    	int num=Integer.parseInt(bf.readLine());
//    	System.out.println(num);
  //  	BufferedReader bf=new BufferedReader(null);
  // 	System.out.println(num-48);
    	
    	Scanner sc=new Scanner(System.in); // Scanner reads input from keyboard (System.in)
    	int num=sc.nextInt();               // Waits for user to type an integer and press Enter
    	System.out.println(num);            // Prints the number the user entered
    }
}
