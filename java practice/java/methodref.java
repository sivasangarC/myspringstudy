import java.util.*;
class methodref{
    public static void main(String[]se)
    {
        List<String> name=Arrays.asList("Navin","Harsh","John");
        List<String> una=name.stream()              // Convert list to a stream for pipeline processing
                            .map(String::toUpperCase) // Method reference: calls toUpperCase() on each string (same as s -> s.toUpperCase())
                            .toList();               // Collect stream results back into a List
        una.forEach(System.out::println); // Method reference: prints each element (same as n -> System.out.println(n))
    }
}