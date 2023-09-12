import java.util.Scanner;

 class getinput {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Read input from the user
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Display the input
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        // Close the scanner
        scanner.close();
    }
}
