public class Encapsulation {
int age;
String name;
public  int getAge(){
    return age;
}
public  String getName(){
    return name;
}
public int setAge(int a){
   return a;
}
public  String setName(String n){
    return n;
}


    public static void main(String[] args) {
        Encapsulation obj=new Encapsulation();
        obj.age=21;
        obj.name="Shiv kant";
        obj.setAge(21);
        obj.setName("Golu");
        System.out.println("My name is "+obj.name+" and My age is"+obj.age);
        System.out.println("This is printed by Encapsulation by the help of getter and setter");
        System.out.println("My name is "+obj.getName()+" and my age is "+obj.getAge());
        System.out.println("this is example of set and get methods");
        System.out.println(obj.setAge(23)+" " +obj.setName("ak"));
}
}

