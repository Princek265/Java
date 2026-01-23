import java.util.Scanner;
@SuppressWarnings("unused")

public class Main{
    public static void main(String args[]) {


        // Calculate the area of a rectangle
        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;
        System.out.println("The area is " + area + "cm²"); // to write ² use cpmmand -> numlock + alt + 0178 
        
        scanner.close();

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter your name: ");
        
        // // String name = scanner.next(); // This only takes input without spaces like Input: John Doe but it takes just John
        
        // String name = scanner.nextLine();
        // System.out.println("Hello! " + name);


        // System.out.print("Enter your age: ");
        // int age = scanner.nextInt();
        // System.out.println("You are " + age + " years old.");
        // System.out.print("Enter your GPA: ");
        // double gpa = scanner.nextDouble();
        // System.out.println("Your GPA is " + gpa);

        // System.out.print("Are you a student? (true/false): ");
        // boolean isStudent = scanner.nextBoolean();
        
        // if(isStudent){
        //     System.out.println("You are enrolled as a student.");
        // }else{
        //     System.out.println("You are NOT enrolled as a student.");
        // }
        // scanner.close();



        // int age = 10;
        // int year = 2026;
        // double price = 202.12;
        // char grade = 'A';
        // boolean isStudent = true;
        // String name = "Parikshit Dogra";
        // System.out.println("Hello, World!");
        // System.out.println("age = " + age + ", year = " + year);
        // System.out.println(price);
        // System.out.println(grade);
        // System.out.println(isStudent);
        // System.out.println("Your name is " + name);


    }
}
