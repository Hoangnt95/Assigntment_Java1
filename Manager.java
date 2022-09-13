/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment;

/**
 *
 * @author Administrator
 */
public class Manager extends Staff{
    private double trachNhiem;

    public Manager(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    public Manager(double trachNhiem, String id, String name, double salary) {
        super(id, name, salary);
        this.trachNhiem = trachNhiem;
    }

    public double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    @Override
    public double getIncome() {
        return super.getIncome() + trachNhiem; 
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
