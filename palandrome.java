import java.util.Scanner;
public class palandrome {

    public static boolean check(String s){
        int st=0;
        int en=s.length()-1;

        while(st<en){
            if(s.charAt(st)!=s.charAt(en)){
                return false;

            }
            st++;
            en--;
        }return true;
    }

    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        if(check(s)){
            System.out.println("Yes its a palindrome : "+s);
        }else{
            System.out.println("No its not a palindrome : "+s);
        }
    }

}
