class A{
    void f1(){
        System.out.println("Hi ! I am function 1");
    }
}
class B extends A{
    void f1(){
        System.out.println("Hi ! I am function 2");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        B obj=new B();
        obj.f1();
    }
}
