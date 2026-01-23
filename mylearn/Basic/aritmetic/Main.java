
public class Main{

    public static void main(String[] args) {
        
        int x = 10;
        int y = 2;
        int z;
        // z = x * y;
        // z = x / y;
        // z = x + y;
        z = x - y;
        // z = x % y;
        System.out.println(z);

        int n = 5;
        // Augmented Assignment Operators

        n+=y;
        // n-=y;
        // n*=y;
        // n/=y;
        // n%=y;
        System.out.println(n);

        // Increment and Decrement Operators

        int i=1;
        i++;
        i--;
        ++i;
        --i;


        // ORDER OF OPERATIONS [P-E-M-D-A-S]
        // Parentheses → Exponents → Multiplication → Division → Addition → Subtraction.

        double result = 3 + 4 * (7 - 5) / 2;

        System.out.println(result);
    }
}