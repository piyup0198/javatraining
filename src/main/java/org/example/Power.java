package org.example;
import java.util.Scanner;

public class Power{

    public static void main(String[] args){

        System.out.println("Enter your connection type and no of units: ");
        Scanner sc= new Scanner(System.in);
        String connectionType = sc.next();
        int units = sc.nextInt();
        double electricBill;

        while (connectionType.equals("domestic")){
            if(units < 200){
                electricBill = (units*(5/2))+250;
                System.out.println("Electric bill is: "+electricBill);
                break;
            } else {
                electricBill = (units*5)+250;
                System.out.println("Elctric bill is: "+electricBill);
                break;
            }
        }

        while(connectionType.equals("industrial")){
            if(units < 1000){
                double subsidy = (units*8)/10;
                electricBill =(units*8)+subsidy+500;
                System.out.println("Electric bil is "+electricBill);
                break;
            }else {
                electricBill = (units*8)+500;
                System.out.println("Electric bill is "+electricBill);
                break;
            }
        }
    }

}
