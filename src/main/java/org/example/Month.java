package org.example;

import java.util.Scanner;

public class Month {

    public enum Months { JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the num for corresponding month");
        int num = sc.nextInt();

        System.out.println("\n");

        for (Months month_name : Months.values())

            System.out.println(month_name);
    }

}