public class Operator {
 public static void main(String[] args) {
    int a=10;
    int b=10;
    // Assignment Operator 

    // 1)post increment:- fetch the value and then increment it
    int res=a++;
    // 2) Pre-increment:-increment the value then fetch it

    int res1=++b;
    System.out.println(res);// 10
    System.out.println(res1);// 11
 }   
}
