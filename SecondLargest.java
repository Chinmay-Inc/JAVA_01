import java.util.Scanner;
public class SecondLargest {

    static int Sec(int [] arr,int n){
        int L=Integer.MIN_VALUE;
        int SL=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>L){
                SL=L;
                L=arr[i];
            }else if(arr[i]>SL&&arr[i]!=L){
                SL=arr[i];
            }
        }return SL;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("The Second Largest Element is : "+Sec(arr,n));
    }
}
