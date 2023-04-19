import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1- Write a java program: ask the user to input the name and the age and print them
        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.next();
        System.out.println("Enter your age");
        int age = input.nextInt();
        System.out.println("your name is: "+name + " and your age is :"+ age);*/


        //2- Write a java program: ask the user to input two numbers and arrange it: Descending, Ascending
        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number:");
        int first = input.nextInt();
        System.out.println("Enter your second number");
        int second = input.nextInt();
        if (first > second)
            System.out.println(first + "is greater than" + second);
        else {
            System.out.println(second + " is greater than " + first);*/



         /*3- write a java program:
        ask the user to input 4 numbers and print the average and the sum
        without using arrays */
        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number:");
        int a = input.nextInt();
        System.out.println("Enter your second number:");
        int b = input.nextInt();
        System.out.println("Enter your third number:");
        int c = input.nextInt();
        System.out.println("Enter your fourth number:");
        int d = input.nextInt();
        int sum = a + b + c + d;
        int average = (a + b + c + d)/4;
        System.out.println("the sum is: " + sum + " the average is: " + average);*/




         /* 4- write a java program:
        ask the user to input a number and print if it odd or even */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        if (number%2 == 0)
            System.out.println("your number is even");
        else {
            System.out.println("your number is odd");
        }
    }
}