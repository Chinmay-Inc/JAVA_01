import java.util.Scanner;
public class insertionSort {

    public static void Sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }

    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int[] arr={9,5,1,7,8,2,4,3,6};
        Sort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }



    }
}
