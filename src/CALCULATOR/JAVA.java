
package CALCULATOR;
import java.util.Scanner;

public class JAVA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char operater = sc.next().charAt(0);
        int b = sc.nextInt();


        switch (operater){
            case '+' : System.out.println(a+b);break;

            case '-' : System.out.println(a-b); break;

            case '*' : System.out.println(a*b); break;

            case '/' : System.out.println(a/b); break;

            case '%' : System.out.println(a%b); break;

            default: System.out.println("invalid");


        }





    }
}
