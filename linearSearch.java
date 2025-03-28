import java.sql.SQLOutput;
import java.util.Scanner;
public class linearSearch {

    public static int Search(int[]arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }return 0;
    }

    public static void main(String [] arrgs){
        Scanner sc = new Scanner(System.in);
        int [] arr={8,5,1,2,9,4,7,3,6,11};
        System.out.println("Enter key : ");
        int key=sc.nextInt();
        int index=Search(arr,key);
        System.out.println(index);
    }
}
