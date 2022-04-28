package com.epam.rd.autotasks.godutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        //Write code here
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        int people = scanner.nextInt();
        int bill;
        if (sum < 0) {
            System.out.println("Bill total amount cannot be negative");
        } else if (people == 0 || people < 0) {
            System.out.println("Number of friends cannot be negative or zero");
        } else {
            bill = (sum/people)/10 + sum/people;
            if (people > sum && sum != 0) bill = 1;
            System.out.println(bill);
        }
    }
}
