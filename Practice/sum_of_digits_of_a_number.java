package Practice;
import java.util.Scanner;
public class sum_of_digits_of_a_number {
    int sum_of_digits(int temp){
        int sum=0;
        while(temp > 0){
            sum+= temp%10;
            temp = temp/10;
        }
        return sum;
    }
    int reverse_num(int num){
        int rev=0;
        while(num > 0){
            int temp = num%10;
            rev = rev*10+temp;
            num/=10;
        }
        return rev;
    }
    boolean is_palindrome(int num){
        if(reverse_num(num) == num){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sum_of_digits_of_a_number obj = new sum_of_digits_of_a_number();
        System.out.println("Sum of digits of a number: "+obj.sum_of_digits(num));
        System.out.println("Reverse of a number: "+obj.reverse_num(num));
        System.out.println("Palindrome: "+obj.is_palindrome(num));
        
    }
}
