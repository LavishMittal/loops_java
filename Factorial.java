import java.util.*;

public class Factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int num = sc.nextInt();
        int factorial = 1;

        if(num == 0){
            System.out.println("The factorial of 0 is 1" );
        }else{
            for(int i = 1; i<=num; i++){
                factorial *= i;
                System.out.println("The factorial of "+ num + " is " + factorial);
                break;
            }
        }
    }
}
