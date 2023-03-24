import java.util.*;
public class continue_keyword {
    public static void main(String args[]){
    //     for (int i =0; i<=5; i++){
    //         if (i==3){
    //             continue;
    //         }
    //         System.out.println(i);
    //     }
    // }
    Scanner sc = new Scanner(System.in);
    do{
        System.out.println("Enter your NUmber: ");
        int num = sc.nextInt();
        
        if(num%10 == 0){
            continue;
        }
        System.out.println(num);
    }while(true);
    }
}