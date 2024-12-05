 class Sum{
    void add2(int a,int b){
        System.out.println("sum of two no is:-" +a+b);

    }
    void add3(int a,int b,int c){
        System.out.println("sum of three no is:-" +a+b+c);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Sum obj=new Sum();
        obj.add2(1,2);
        obj.add3(1,2,3);
    }
}
