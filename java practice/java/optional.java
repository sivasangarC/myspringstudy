import java.util.*;
class option{
    public static void main(String[]se)
    {
        List<String> nam=Arrays.asList("navin","laminx","john","kishore");
        String na=nam.stream()
                            .filter(str->str.contains("x")) // filter() keeps only strings that contain "x"
                            .findFirst()                    // findFirst() returns the first match as Optional
                            .orElse("not found");           // orElse() returns fallback value if no match found
       System.out.print(na);
    }
}