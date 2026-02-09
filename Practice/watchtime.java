// package Practice;
import java.util.Scanner;
public class watchtime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of movies watched: ");
        int moviesWatched = sc.nextInt();
        System.out.print("Enter Number of movies Binge-watched before break: ");
        int bingeLimit = sc.nextInt();
        int break_time;
        if(bingeLimit!=0){
            if(moviesWatched%bingeLimit==0){
                break_time = ((moviesWatched/bingeLimit)*15)-15;
            }else{
                break_time = (moviesWatched/bingeLimit)*15;
            }
            int total_time_spent = (45 * moviesWatched) + break_time;
            System.out.println("Total minutes spent on BingeWatching: " + total_time_spent + " mins.");
        }else{
            int total_time_spent = (45 * moviesWatched);
            System.out.println("Total minutes spent on BingeWatching: " + total_time_spent + " mins.");
        }
    }
}
