public class passbyValue_reference {

    public static int num(int  n){
        return n+2;
    }

    public static int[] array(int[]arr){
        for(int i=0;i<arr.length;i++){
            arr[i]*=2;
        }return arr;
    }

    public static void main(String [] args){
        int[] arr={1,2,3};
        int n=5;


        int c=num(n);
        array(arr);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.println(c);
    }
}
