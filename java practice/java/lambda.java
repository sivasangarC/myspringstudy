@FunctionalInterface  // Only one abstract method allowed — enables lambda usage
interface A
{
	int add(int i, int j);
}

public class lambda{
    public static void main(String[] args) {
    	A obj=(i,j) -> i+j; // Lambda: replaces full anonymous class, (i,j) are params, i+j is the return value
   	
   	int result=obj.add(5, 4); // Calls the lambda — returns 5+4 = 9
   	System.out.println(result);
    }
}
