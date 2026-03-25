@FunctionalInterface  // Ensures this interface has exactly ONE abstract method (required for lambda use)
interface A
{
    void show(int i);
}

public class Demo {
    public static void main(String[] args) {
        A obj=i -> System.out.println("in show "+i); // Lambda replaces anonymous class — i is the parameter, right side is the body
        obj.show(5); // Calls the lambda with value 5
    }
}