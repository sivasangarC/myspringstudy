public class excetion {
    public static void main(String[]se)
    {
        int i=2;
        int j=0;
        int nums[]=new int[5];
        try
        {
            j=18/i;
            System.out.println(nums[1]); 
            System.out.println(nums[5]); // This throws ArrayIndexOutOfBoundsException — index 5 doesn't exist in size-5 array
               
        }
        catch(ArithmeticException e)  // Catches divide-by-zero errors
        {
        System.out.println("cannot divide by zero ");
        } 
        catch(ArrayIndexOutOfBoundsException e) // Catches array access beyond its size
        {
            System.out.println("Stay in yout limit.");
        }

        System.out.println("Bye");
    }

    
}
//it will execute only if there is any exception other wise it will not work
//exception Hierarchy -->
//  