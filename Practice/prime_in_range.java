// package Practice;
// import java.util.Scanner;

// public class prime_in_range {
//     // Method is_prime
//     static boolean is_prime(int num){
//         if(num == 1 || num == 0){
//             return false;
//         }
//         for(int i=2;i<=(num*0.5);i++){
//             if(num%i==0){
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();

//         for(int i=0;i<=num;i++){
//             if(is_prime(i) == true){
//                 System.out.print(i + " ");
//             }
//         }
        

//     }
// }

package Practice;
import java.util.Scanner;

public class prime_in_range {
    // Method is_prime
    boolean is_prime(int num){
        if(num == 1 || num == 0){
            return false;
        }
        for(int i=2;i<=(num*0.5);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        prime_in_range obj = new prime_in_range();
        /* 
            to use the user defined functions in current class
            we first create an object of current class 
            throw the object we can call our user-defined function
        */
        for(int i=0;i<=num;i++){
            if(obj.is_prime(i) == true){
                System.out.print(i + " ");
            }
        }
        

    }
}




