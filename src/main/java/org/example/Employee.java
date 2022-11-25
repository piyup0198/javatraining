package org.example;

public class Employee {
    public Employee(int empid,String empname)
    {
        System.out.println("employee1 is created"+ " " + empid+" "+empname);
    }

    public  Employee(int empid,String empname,String designation){
       System.out.println("employee2 is created "+ " " + empid+" " +" "+empname+" "+designation);
    }
    public static void main(String[] args){
        Employee e1 = new Employee(34,"Lata");
        Employee e2 = new Employee(56,"Rohit","sde");
    }
}
