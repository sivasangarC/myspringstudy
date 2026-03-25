import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.*;
import java.util.function.Consumer;
class stremapi {
    public static void main(String[] args){   
    	
    	List<Integer> nums= Arrays.asList(4,5,7,3,2,6);
    	
//    	for(int i=0;i<nums.size();i++)
//    	{
//    		System.out.println(nums.get(i));
//    	}
    	
    	
//    	for(int n: nums)
//    	{
//    		System.out.println(n);
//    	}
    	//it is a form of stream  api
//     	nums.forEach(n -> System.out.println(n));
    	
    	
//     	int sum=0;
//     	for(int n:nums)
//     	{
//     		if(n%2==0)
//     		{
//     			n=n*2;
//     			sum=sum+n;
//     		}
//     	}
    	
// //    	System.out.println(nums);
//     	System.out.println(sum);
Consumer<Integer> c=n->
			System.out.println(n); // Consumer<T>: takes one input, returns nothing — used for side effects like printing
			System.out.print("hello");
nums.forEach(c); // forEach() passes each list element into the Consumer c
//n-> System.out.println(n);
		
		

  
    }
}