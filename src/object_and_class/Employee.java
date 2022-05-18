package object_and_class;

public class Employee {
    // propertices
    String name= "Rohan";
    int salary=55000;
    String departmentname="Electrical";

    public static void main(String[] args) {
        Employee obj=new Employee();
        System.out.println("Printing Object Properties"+obj.name);
        System.out.println("Printing Object Properties"+obj.salary);
        System.out.println("Properties Object Properties"+obj.departmentname);
    }
}
