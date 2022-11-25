package org.example;
import java.util.Scanner;
import java.util.*;

public class Luckynum {

    public static void main(String args[]){
        int hiddennum = 7;
        Scanner sc= new Scanner(System.in);
        int attempts = 0;
        while(true){
            System.out.println("Guess the num ");
            int guessednum = sc.nextInt();
            attempts+=1;
            if(guessednum == hiddennum){
                System.out.println("Great! you have guessed in right in "+ attempts+ " attempts");
                break;
            }
            else{
                System.out.println("Not Really! Please Try Again!!");
            }
        }

    }
}
