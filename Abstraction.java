abstract class Name{
    Name(){
        System.out.println("My name is Shiv Kant");
    }
    abstract void OtherName();
    void address(){
        System.out.println("I am from Patna");
    }
}
class New extends Name{
    void OtherName(){
        System.out.println("Other Name:- Golu Sharma");
    }
}




public class Abstraction {
    public static void main(String[] args) {
//Name obj=new Name();
        Name obj=new New();
        obj.OtherName();
        obj.address();
    }
}
