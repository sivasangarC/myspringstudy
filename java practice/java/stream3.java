import java.util.*;
class stream3{
    public static void main(String[]se)
    {
        int si=10_000;  // Underscore in number literal — just for readability, same as 10000
        List<Integer> nu=new ArrayList<>(si);
        Random ran =new Random();
        for(int i=1;i<=si;i++)
        {
            nu.add(ran.nextInt(100)); // Add a random number between 0-99 to the list
        }
       int sum=nu.stream()
                        .map(i->i+2)          // Add 2 to each element
                        .reduce(0,(c,e)->c+e); // reduce() accumulates all values into one sum (c=running total, e=current element)
        int sum2=nu.stream()
                        .map(i->i+2)
                        .mapToInt(i->i)  // Convert Stream<Integer> to IntStream (primitive, more efficient)
                        .sum();          // IntStream.sum() is faster than reduce for summing
         int sum3=nu.parallelStream()    // parallelStream() uses multiple threads — faster for large data
                        .map(i->i+2)
                        .mapToInt(i->i)
                        .sum();
        System.out.println(sum+" "+sum2+" "+sum3);
    }
}