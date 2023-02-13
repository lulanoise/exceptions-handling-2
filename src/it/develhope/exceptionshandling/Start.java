package it.develhope.exceptionshandling;
import java.util.Scanner;

public class Start {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a dividend:");
        int dividend = scanner.nextInt();
        System.out.println("Enter a divisor:");
        int divisor = scanner.nextInt();

        if (divisor == 0) {
            System.out.println("It's not possible to divide by zero!");
        } else {
            double quotient = (double) dividend / divisor;
            System.out.println("The quotient is " + quotient);

        }
    }

}