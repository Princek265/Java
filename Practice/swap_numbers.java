package Practice;
import java.util.Scanner;
public class swap_numbers {
    
    void swap(int a,int b){
        a = a^b;
        b = b^a;
        a = a^b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int temp;

        temp = a;
        a=b;
        b=temp;
        System.out.println(a + " " + b);

        // a = a^b;
        // b = b^a;
        // a = a^b;
        swap_numbers obj = new swap_numbers();
        obj.swap(a, b);
        System.out.println(a + " " + b);

    }

}
