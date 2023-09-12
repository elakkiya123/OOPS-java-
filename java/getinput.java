import java.util.Scanner;
class getinput{
    public static void main(String[] args){
        //create a scanner object
        Scanner scanner= new Scanner(System.in);
        //read input from user
       System.out.println("Enter your name");
        String name= scanner.nextLine();
        System.out.println("Enter your age");
        int age= scanner.nextInt();
        //display the inputja
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        //close the scanner
       scanner.close(); 

    }
}