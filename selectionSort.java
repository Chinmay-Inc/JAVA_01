public class selectionSort {

    public static void Sort(int[]arr){
        int n=arr.length;
        
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;


        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[]args){
        int[]arr={9,5,1,6,7,8,4,2,3};
        Sort(arr);
    }
}
