package org.example;

import java.util.Scanner;

import java.util.Scanner;

    public class Order{
        public static void main(String[] args){

            System.out.println("Enter the product and quantity");
            Scanner sc= new Scanner(System.in);
            String productName = sc.next();
            int quantity = sc.nextInt();
            System.out.println("the product is "+productName+" and quantity is "+quantity);

            String cooker;
            while (productName.equals("cooker")){
                if (quantity > 50) {
                    int price = quantity*850;
                    System.out.println("Total price is "+price);
                    break;
                } else if (quantity < 50 && quantity > 30) {
                    int price = quantity*900;
                    System.out.println("Total price is "+price);
                    break;
                } else if (quantity<30) {
                    int price = quantity*950;
                    System.out.println("Total price is "+price);
                    break;
                }
            }

            String kettle;
            while (productName.equals("kettle")){
                if (quantity > 50) {
                    int price = quantity*700;
                    System.out.println("Total price is "+price);
                    break;
                } else if (quantity < 50 && quantity > 30) {
                    int price = quantity*800;
                    System.out.println("Total price is "+price);
                    break;
                } else if (quantity<30) {
                    int price = quantity*900;
                    System.out.println("Total price is "+price);
                    break;
                }
            }



        }
}
