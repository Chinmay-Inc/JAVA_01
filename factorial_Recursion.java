import java.util.Scanner;
public class factorial_Recursion {

    public static int Fact(int n){
        int F=0;
        while(n>=1){
            F*=n;
        }
        Fact(n-1);
        return F;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        System.out.println(Fact(n));

    }
}
