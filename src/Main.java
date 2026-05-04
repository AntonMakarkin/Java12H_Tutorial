public class Main {
    public static void main(String[] args) {
        System.out.println("I like pizza");
        System.out.println("Its really good");
        System.out.println("Buy me");

        int age = 21;
        int year = 2025;
        System.out.println(age);
        System.out.println("The year is " + year);

        double price = 19.99;
        double gpa = 3.5;
        double temperature = -12.5;
        System.out.println("$" + price);

        char grade = 'A';
        char symbol = '!';
        System.out.println(grade);

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        if (isStudent) {
            System.out.println("You are a student");
        } else {
            System.out.println("You are not a student");
        }
        System.out.println(forSale);

        String name = "Anton Makarkin";
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your gpa is: " + gpa);
        System.out.println("Your average letter grade is: " + grade);
    }
}
