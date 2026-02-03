package Practice;
import java.util.Scanner;

public class prime {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        for(int i=2;i<=(num*0.5);i++){
            if(num%i==0){
                System.out.println(num + " is not a Prime number.");
                return;
            }
        }
        System.out.println(num + " is a Prime number.");

    }
}
