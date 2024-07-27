package Java_Code_Striver.Easy;
import java.util.Scanner;
public class SecondLargest {
    public static int f(int []arr,int n){

        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>maxi){
                maxi=arr[i];
            }
        }
    int maxi2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>maxi2 && arr[i]!=maxi){
                maxi2=arr[i];
            }
        }
        return maxi2;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=f(arr,n);
        System.out.println("Second Largest No is :"+ans);
    }
}
