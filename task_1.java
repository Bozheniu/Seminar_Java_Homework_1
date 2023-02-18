package java_homework;

import java.util.Scanner;

public class task_1 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Put the number: ");
        int number = iScanner.nextInt();
        int triangular = number * (number + 1) / 2;
        System.out.println("Triangular Number for " + number + " is " + triangular);
    }

}