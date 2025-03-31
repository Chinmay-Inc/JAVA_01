import java.util.Scanner;
import java.util.Arrays;
public class inbuilt_sorting {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Original array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        System.out.println("Sorted array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
