package Practice;
import java.util.Scanner;
public class Concert_ticket {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Concert Name: ");
        String concertName = sc.nextLine();
        System.out.print("Enter Seat Number: ");
        int seatNumber = sc.nextInt();
        System.out.print("Enter Ticket Price: ");
        float ticketPrice = sc.nextFloat();
        System.out.print("Enter Seat Availabilty Status: ");
        boolean saStatus = sc.nextBoolean();

        System.out.println("Concert Name: "+ concertName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.printf("Ticket Price: %.2f \n", ticketPrice);
        if(saStatus){
            System.out.println("Available");   
        }else{
            System.out.println("Not Available");   

        }


        



    }
}
