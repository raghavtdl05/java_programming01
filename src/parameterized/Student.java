package parameterized;

public class Student {
    String name= "Ram";
    int age=23;
    String branch ="electrical";

    public static void main(String[] args) {

    }
    public Student(String name, int age, String branch){
            this.name = name;
            this.age = age;
            this.branch = branch;
    Student obj = new Student("ram",23,"electrical");

        System.out.println("printing name"+obj.name + "age"+obj.age +"branch"+obj.branch);
         Student obj1 = new Student("RAMAN",24,"Computer");
        System.out.println("printing name"+obj1.name +"age"+obj1.age+"branch"+obj1.branch);

        }
    }

