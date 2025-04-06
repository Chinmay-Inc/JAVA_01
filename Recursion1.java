import java.util.Scanner;
public class Recursion1 {

    public static void Met1(int count){
        System.out.println(count);
        if(count<=5){
            return ;
        }
        Met1(count-1);
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Met1(10);
    }
}
