public class Constructor {
    int age;
    public Constructor(){
        System.out.println("Default Constructor is called explicitly");
    }
//    public Constructor(int age){
//        this.age=age;
//    }
    // if u did not want to use this keyword then do this way
    private Constructor(int newAge){
        age=newAge;

    }

    public static void main(String args[]){
Constructor c=new Constructor();
    c.age=21;
    System.out.println(c.age);

    }
}
