
import java.util.Scanner;
public class temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Temperature in Fehranheit: ");
        double tempFeh = sc.nextDouble();
        if(tempFeh >=100 && tempFeh <= 150){
            double tempCel = (tempFeh - 32) * 5/9;
            System.out.printf("Temperature in Celcius: %.2f", tempCel);
        }else{
            System.out.println("Temperature outside the human survivable range.");
        }
    }
}
