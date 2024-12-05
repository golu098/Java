//public class ClassObject {
//    int employee_id = 10;
//    String name = "Shiv Kant";
//
//    void employeeMoreDetails(String address) {
//
//        System.out.println(address);
//
//    }
//
//
//    public static void main(String[] args) {
//        ClassObject object = new ClassObject();
//        object.employeeMoreDetails("Patna");
//        System.out.println(object.name);
//        System.out.println(object.employee_id);
//    }
//}




//------------------------------By Custom input same code as above-------

import java.util.Scanner;

class ClassObject{
    int employee_id;
    String name;
    void employee(String address){
        System.out.println("I am from "+address);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ClassObject obj=new ClassObject();
        System.out.println("Enter the employee Id:");
        obj.employee_id=sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the name:");
        obj.name=sc.nextLine();
        System.out.println("Enter the employee address:");
        String address=sc.nextLine();
        obj.employee(address);
        System.out.println("My Empoyee Id is "+obj.employee_id);
        System.out.println("My name is "+obj.name);

        sc.close();
    }
}