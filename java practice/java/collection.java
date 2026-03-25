import java.util.*;
class collection
{
    public static void main(String[]se)
    {
        //Arraylist
        // Collection<Integer> nums=new ArrayList<>();
        // nums.add(6);
        // nums.add(7);
        // nums.add(8);
        // System.out.print(nums);

        //----------------------------------------
        //set is a unique value
        //also in order is suffeld in any order
       // Collection<Integer> nums=new HashSet<>();
        //treeset will provide the output in sorted order

    //    Collection<Integer> nums=new TreeSet<>();
    //     nums.add(10);
    //     nums.add(7);
    //     nums.add(8);
    //     nums.add(8);
    //     nums.add(1);

    //     //iterator is top most element
    //     Iterator<Integer> va=nums.iterator();
    //     while(va.hasNext())
    //     {
    //     System.out.println(va.next());
    //     }

    ///------------------------------------------------------------------
    /// map
    /// keys cnnaot be repeated but values can be
    Map<String, Integer> stu=new HashMap<>(); // HashMap stores key-value pairs, keys must be unique
    stu.put("navu",56);  // put() adds a key-value pair to the map
    stu.put("har",61);
    stu.put("susi",86);
    stu.put("kira",96);
    System.out.println(stu.keySet()); // keySet() returns all keys in the map
    	
    	for(String key : stu.keySet()) // loop through each key
    	{
    		System.out.println(key + ":" + stu.get(key)); // get(key) fetches the value for that key
    	}
//System.out.print(stu);



    }

}