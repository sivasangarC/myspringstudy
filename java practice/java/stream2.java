import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

class stream2{
    public static void main(String[] args){   
    	
    	List<Integer> nums=Arrays.asList(4,5,7,3,2,6);
    	
//    	Predicate<Integer> p= new Predicate<Integer>() {
//    		public boolean test(Integer n) {
//    			return n%2==0;
//    			if(n%2==0)
//    				return true;
//    			else
//    				return false;
//    		}
//    	};
    	
//    	Predicate<Integer> p= n-> n%2==0;
    	
    	
//    	Function<Integer, Integer> fun= new Function<Integer,Integer>() {
//    		public Integer apply(Integer n) {
//    			return n*2;
//    		}
//    	};
    	
//    	Function<Integer,Integer> fun= n-> n*2;
 	
    	
//    	int result=nums.stream()
//    					.filter(n-> n%2==0)
//    					.map(n->n*2)
//    					.reduce(0, (c,e)-> c+e);
//    	System.out.println(result);
    	
//    	Stream<Integer> sortedValues = nums.stream()
//    			.filter(n-> n%2==0)
//    			.sorted();
    	
    	Stream<Integer> sortedValues = nums.parallelStream() // parallelStream() splits work across multiple CPU cores for faster processing
    			.filter(n-> n%2==0)  // Keep only even numbers
    			.sorted();           // Sort the filtered results
    	
    	sortedValues.forEach(n -> System.out.println(n)); // Print each result
    }
}