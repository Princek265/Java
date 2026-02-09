package Practice;
import java.util.Scanner;

public class movie_ratings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter movie rating (1-5): ");
        int rating = sc.nextInt();
        sc.nextLine();

        if(rating <=5 && rating >=1){
            System.out.print("Enter movie review: ");
            String review = sc.nextLine();
            System.out.println("Recent Review Rating: ["+rating+"] stars");
            System.out.println("Review Details: " + review);
        }else{
            System.out.println("Invalid Rating.");
        }

    }
}
