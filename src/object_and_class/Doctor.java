package object_and_class;

public class  Doctor {
    String Name ="Rohit";
    int age= 25;
    String Hospital ="Agra";

    public static void main(String[] args) {
        Doctor obj = new Doctor();
        System.out.println("Printing Object Name"+obj.Name);
        System.out.println("Printing Object age"+obj.age);
        System.out.println("Printing Object Hospital"+obj.Hospital);
        // new object;
        Doctor obj1 = new Doctor();
        System.out.println("Printing Object Name"+obj1.Name);
        System.out.println("Printing Object Age"+obj1.age);
        System.out.println("printing object Hospital"+obj1.Hospital);



    }
}
