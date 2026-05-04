import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine();
//
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//
//        System.out.print("What is your gpa: ");
//        double gpa = scanner.nextDouble();
//
//        System.out.print("Are you student?");
//        boolean isStudent = scanner.nextBoolean();
//
//        System.out.println("Hello " + name);
//        System.out.println("You are " + age + " years old");
//        System.out.println("Your gpa is: " + gpa);
//
//        if (isStudent) {
//            System.out.println("You are enrolled as a student");
//        } else {
//            System.out.println("You are NOT enrolled");
//        }
//
//        scanner.close();

        // Calculate area of rectangle

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner recScanner = new Scanner(System.in);

        System.out.print("Enter the width: ");
        width = recScanner.nextDouble();

        System.out.print("Enter the height: ");
        height = recScanner.nextDouble();

        area = width * height;

        System.out.println("The area is: " + area + "cm");

        recScanner.close();
    }
}