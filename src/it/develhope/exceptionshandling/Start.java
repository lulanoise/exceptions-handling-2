package it.develhope.exceptionshandling;
import java.util.Scanner;

public class Start {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a dividend:");
        int dividend = scanner.nextInt();
        System.out.println("Enter a divisor:");
        int divisor = scanner.nextInt();

        try {
            double quotient = (double) dividend / divisor;
            System.out.println("The quotient is: " + quotient);
        } catch (ArithmeticException e) {
            System.out.println("Error: it's not possible to divide by zero");
        }
    }

}