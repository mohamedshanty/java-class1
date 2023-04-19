import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Write a java program: ask the user to input the name and the age and print them
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.next();
        System.out.println("Enter your age");
        int age = input.nextInt();
        System.out.println("your name is: "+name + " and your age is :"+ age);
    }
}