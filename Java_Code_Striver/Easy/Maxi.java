// Largest Element in an Array
package Java_Code_Striver.Easy;
import java.util.Scanner;
public class Maxi {
    public static  int f(int []arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size=sc.nextInt();
        int[]arr=new int[size];
        System.out.println("Enter the elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int maxElement=f(arr);
        System.out.println("The max Element is "+maxElement);
    }
}
