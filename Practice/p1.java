package Practice;
import java.util.Scanner;
public class p1 {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input 1: ");
        double input_1  = scanner.nextDouble();
        System.out.print("Enter input 2: ");
        double input_2  = scanner.nextDouble();
        System.out.print("Enter Choice: ");
        int choice = scanner.nextInt();

        if(choice == 1){
            System.out.println("Sum: " + ((int)input_1 + (int)input_2));
        }else if(choice == 2){
            System.out.println("Sub: " + ((int)input_1 - (int)input_2));
        }else if(choice == 3){
            System.out.println("Mul: " + ((int)input_1 * (int)input_2));
        }else if(choice == 4){
            if(input_2 == 0){
                System.out.println("Denominator cannot be 0.");
            }else{
            System.out.println("Div: " + ((int)input_1 / (int)input_2));
            }
        }
        else{
            System.out.println("Invalid Choice.");
        }

    }
}
