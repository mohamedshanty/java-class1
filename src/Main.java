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
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is: " + area);*/



        /* 12- write a java program:
        ask the user to input the shape for cube and print the volume*/
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length of the cube: ");
        double sideLength = scanner.nextDouble();
        double volume = sideLength * sideLength * sideLength;
        System.out.println("The volume of the cube is: " + volume);*/



         /* 13- write a java program:
        ask the user to input string and print the length for that*/
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int length = input.length();
        System.out.println("The length of the string is: " + length);*/



        /* 14- write a java program:
        ask the user to input number and get the absolute value*/
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        double absoluteValue = Math.abs(number);
        System.out.println("The absolute value of the number is: " + absoluteValue);*/



         /* 15- write a java program:
        ask the user to input value and determine if it positive or negative and print zero if its 0*/
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }*/



        /* 16- write a java program:
        ask the user to input number then generates an integer between 1 and 7 and displays
        the name of the weekday*/
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        String weekdayName = "";
        switch (number) {
            case 1:
                weekdayName = "Sunday";
                break;
            case 2:
                weekdayName = "Monday";
                break;
            case 3:
                weekdayName = "Tuesday";
                break;
            case 4:
                weekdayName = "Wednesday";
                break;
            case 5:
                weekdayName = "Thursday";
                break;
            case 6:
                weekdayName = "Friday";
                break;
            case 7:
                weekdayName = "Saturday";
                break;
        }
        System.out.println("The weekday corresponding to the generated number is: " + weekdayName);*/



        /* 17- write a java program:
        ask the user to input a year number than print whether that year is a leap year or not*/
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }
            } else {
                System.out.println(year + " is a leap year.");
            }
        } else {
            System.out.println(year + " is not a leap year.");
        }*/




          /* 18- write a java program:
        ask the user to input 3 values and compare which is max and min value*/
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first value: ");
        int value1 = scanner.nextInt();
        System.out.print("Enter the second value: ");
        int value2 = scanner.nextInt();
        System.out.print("Enter the third value: ");
        int value3 = scanner.nextInt();
        int maxValue = value1;
        if (value2 > maxValue) {
            maxValue = value2;
        }
        if (value3 > maxValue) {
            maxValue = value3;
        }

        int minValue = value1;
        if (value2 < minValue) {
            minValue = value2;
        }
        if (value3 < minValue) {
            minValue = value3;
        }
        System.out.println("The maximum value is: " + maxValue);
        System.out.println("The minimum value is: " + minValue);*/




        /* 19- write a java program:
        ask the user to input character and print it*/
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        System.out.println("You entered: " + ch);*/




        /* 20- write a java program:
        Bmi calculator
        ask the user to input his weight (kilogram) and the height (meter)
        bmi = (weight) / (height*height)
        if the bmi smaller than or equal 20
        print you should increase the weight
        if the bmi gratter than 20 and less than or equal 25
        print perfect weight
        if the bmi gratter than 25 and less than or equal 30
        print you should lose some weight
        anything else print overload*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);

        if (bmi <= 20) {
            System.out.println("You should increase your weight.");
        } else if (bmi > 20 && bmi <= 25) {
            System.out.println("Perfect weight.");
        } else if (bmi > 25 && bmi <= 30) {
            System.out.println("You should lose some weight.");
        } else {
            System.out.println("Overload.");
        }
    }
}