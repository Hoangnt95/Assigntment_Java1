/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Staff {
    private String id;
    private String name;
    private double salary;
    private double incomee;
    
    public static final double tax1 = 0.1;
    public static final double tax2 = 0.12;
    public double tax;

    public Staff() {
    }

    public Staff(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getTax(){
        if(salary >= 15000){
            tax = salary*tax2;
        }else if(salary < 15000 && salary >= 9000){
            tax = salary * tax1;
        }else{
            tax = 0;
        }
        return tax ;
    }
    public double getIncome(){
        incomee = salary - getTax();
        return incomee;
    }
    public void input1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao Ma NV la : ");
        this.setId(sc.nextLine());
        System.out.print("Nhap vao Ho Ten NV la : ");
        this.setName(sc.nextLine());
        System.out.print("Nhap vao Luong NV la : ");
        this.setSalary(Double.parseDouble(sc.nextLine()));
    }

    @Override
    public String toString() {
        return "Staff information : " + "id = " + getId() + " - name = " + getName() + " - salary = " + getSalary() + " - incomee = " +getIncome();
              
    }
    
    

}
