/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment;

/**
 *
 * @author Administrator
 */
public class MarketingStaff extends Staff{
    private double doanhSo;
    private double hoaHong;

    public MarketingStaff(double doanhSo, double hoaHong) {
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

    public MarketingStaff(double doanhSo, double hoaHong, String id, String name, double salary) {
        super(id, name, salary);
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHoaHong() {
        return hoaHong;
    }

    public void setHoaHong(double hoaHong) {
        this.hoaHong = hoaHong;
    }
    

    @Override
    public double getIncome() {
        return super.getIncome() + doanhSo + hoaHong;
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
