package org.example;

public class PermanentEmployee extends Employee1{
    int salary = 1000;
    int pf = 10;
    int netSalary = salary - (salary*pf/100);
}
