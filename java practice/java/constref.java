import java.util.*;
class Student{
    Private String name;
    Private int age;

    public Student{

    }
    public Student(String name)
    {
        this.name=name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
}
class constref{
    public static void main(String[]se)
    {
         List<String> name=Arrays.asList("Navin","Harsh","John");
        // List<Student> una=name.stream()
        //                     .map(String::toUpperCase)
        //                     .toList();
       // System.out.print(una);
       //this a method usning java there are so many methods to be known
     //una.forEach(System.out::println);
    
     List<String> stud=new ArrayList<>();
     stud=name.stream()
                    .map(name->new Student(name))
                    .toList();
    System.out.println(stud);
    }
}