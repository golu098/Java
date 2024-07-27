import java.util.Scanner;

public class ForEach {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []company=new int[size];
        //Taking input for Array
        for(int i=0;i<size;i++){
            company[i]=sc.nextInt();
        }
        // Accessing the element of the array
        for(int num:company){
            System.out.println(num);
        }
        sc.close();

    }
}
