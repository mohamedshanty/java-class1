import javax.swing.*;
import java.util.Objects;
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
        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        if (number%2 == 0)
            System.out.println("your number is even");
        else {
            System.out.println("your number is odd");
        }*/



         /* 5- write a java program:
        ask the user to input the username, if the user name is true, let him to enter the
        password, and if the password is true print “Hello”*/
        /*int attempt = 0;
        String userName = "mohamed._.sh27";
        String password = "123";
        String userNameEntered;
        String passwordEntered;
        userNameEntered = (JOptionPane.showInputDialog("Please enter the username"));
        if (Objects.equals(userNameEntered, userName)){
            passwordEntered = (JOptionPane.showInputDialog("Please enter the password"));
            if (Objects.equals(passwordEntered, password)){
                JOptionPane.showMessageDialog(null , "Hello");
            }
            else {
                JOptionPane.showMessageDialog(null , "your username or password is error");
            }
        }
        else {
            JOptionPane.showMessageDialog(null , "your username error");
        }*/



        /* 6- write a java program:
        ask the user to input two number than choose the operation and apply it*/
        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1 = input.nextInt();
        System.out.println("Enter number 2:");
        int num2 = input.nextInt();

        System.out.println("1- +");
        System.out.println("2- -");
        System.out.println("3- *");
        System.out.println("4- /");
        System.out.println("Enter your choose");
        int choose = input.nextInt();
        switch (choose){
            case 1:
                System.out.println(num1+num2);
                break;
            case 2:
                System.out.println(num1-num2);
                break;
            case 3:
                System.out.println(num1*num2);
                break;
            case 4:
                System.out.println(num1/num2);
                break;
        }*/



         /* 7- write a java program:
        ask the user to input 2 numbers then return the remainder and the result */
        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1 = input.nextInt();
        System.out.println("Enter number 2:");
        int num2 = input.nextInt();
        int division=0, remainder=0;
        division = num1/num2;
        remainder = num1%num2;
        System.out.printf("the result is :%d\nthe remainder is :%d",division , remainder);*/



        /* 8- write a java program:
        that change two variables values */
        /*Scanner input = new Scanner(System.in);
        int a =0, b=0;
        System.out.println("Enter a number:");
        a = input.nextInt();
        System.out.println("Enter b number:");
        b = input.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.printf("a=%d \nb=%d",a, b);*/



        /* 9- write a java program:
        the user input a string ( sa, su , mo , tu, we, th, fr)
        if the input sa : print Saturday, if the input su : print Sunday
        if the input mo : print Monday ..... to end */
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string (sa, su, mo, tu, we, th, fr): ");
        String input = scanner.nextLine();
        switch (input) {
            case "sa":
                System.out.println("Saturday");
                break;
            case "su":
                System.out.println("Sunday");
                break;
            case "mo":
                System.out.println("Monday");
                break;
            case "tu":
                System.out.println("Tuesday");
                break;
            case "we":
                System.out.println("Wednesday");
                break;
            case "th":
                System.out.println("Thursday");
                break;
            case "fr":
                System.out.println("Friday");
                break;
            default:
                System.out.println("Invalid input.");
        }*/



        /* 10- write a java program:
        ask the user to input two for rectangle and get the area*/
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        double area = length * width;
        System.out.println("The area of the rectangle is: " + area);*/



        /* 11- write a java program:
        ask the user to input the radius and print the area*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is: " + area);
    }
}