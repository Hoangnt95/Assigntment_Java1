/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment;

import Demo_oop.BT_TUAN3.Xe_may;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Service_Staff {

    ArrayList<Staff> list = new ArrayList();
    Scanner sc = new Scanner(System.in);
    Staff st = new Staff();
    int choice,temp;

    public void menu() {
        System.out.println("===Chuong trinh quan ly Nhan Vien===");
        System.out.println("1 . Nhap danh sach nhan vien");
        System.out.println("2 . Xuat danh sach nhan vien");
        System.out.println("3 . Tim va hien thi nhan vien theo ma nhan vien");
        System.out.println("4 . Xoa nhan vien theo ma nhan vien");
        System.out.println("5 . Cap nhat thong tin theo ma nhan vien");
        System.out.println("6 . Tim cac nhan vien theo khoang luong");
        System.out.println("7 . Sap xep nhan vien theo ho ten");
        System.out.println("8 . Sap xep nhan vien theo thu nhap");
        System.out.println("9 . Xuat 5 nhan vien co thu nhap cao nhat");
        System.out.println("0 . Thoat");
        while (true) {
            try {
                choice = Integer.parseInt(mess("lua chon "));
                break;
            } catch (Exception e) {
                System.out.println("Lua chon nhap vao la so !");
            }
        }
        switch (choice) {
            case 1:
                input();
                break;
            case 2:
                show();
                break;
            case 3:
                showID();
                break;
            case 4:
                delete();
                break;
            case 5:
                update();
                break;
            case 6:
                search_Salary();
                break;
            case 7:
                Sort_name();
                break;
            case 8:
                System.out.println("=== Danh sach nhan vien sau khi sap xeo theo thu nhap la ===");
                Sort_income();
                show();
                break;
            case 9:
                show_Top5();
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Nhap lua chi tu 0 - 9 ");
        }
    }

    public boolean checkID(String a) {
        boolean b = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equalsIgnoreCase(a)) {
                b = true;
            }
        }
        return b;
    }
    
    public boolean checkList(boolean a){
        if (a == true) {
            System.out.println("========== > Danh sach trong !");
            return true;
        }
        return false;
    }
    
    public String mess(String a) {
        System.out.printf("Nhap vao %s la : ", a);
        return sc.nextLine();
    }
    
    public int index(String a){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equalsIgnoreCase(a)) {
                return i;
            }
        }
        return -1;
    }
    
    

    public void input() {
        System.out.println("===Nhap thong tin nhan vien===");
        String exit = "n";
        while (exit.equalsIgnoreCase("n")) {
            Staff st2 = new Staff();
            while (true) {
                st2.setId(mess("ma NV "));
                if (checkID(st2.getId()) == true) {
                    System.out.println("===> Ma nhan vien bi trung");
                } else {
                    break;
                }
            }

            while (true) {
                st2.setName(mess("ten NV "));
                if (st2.getName() == "") {
                    System.out.println("Ten nhan vien khong duoc bo trong");
                } else {
                    break;
                }
            }

            while (true) {
                try {
                    st2.setSalary(Double.parseDouble(mess("luong NV")));
                    if (st2.getSalary() < 0) {
                        System.out.println("Nhap luong khong hop le");

                    } else {
                        break;
                    }

                } catch (Exception e) {
                    System.out.println("Luong nhap vao phai la so !");
                }
            }
            list.add(st2);
            System.out.println("Ban co muon thoat khong ? ( y/Y ) ");
            exit = sc.nextLine();
        }
    }

    public void show() {
        if (checkList(list.isEmpty()) == true) {
            return;
        }
        System.out.println("===Xuat thong tin nhan vien===");
        list.forEach(System.out::println);
        System.out.println("==============================");
    }
    
    public void showID(){
        if (checkList(list.isEmpty()) == true) {
            return;
        }
        System.out.println("===Hien thi thong tin theo ma NV===");
        String ma = mess("ma NV ");
        temp = index(ma);
        if (temp == -1) {
            System.out.println("===> Khong tim thay ma NV vua nhap .");
            return;
        }
        System.out.println(list.get(temp).toString());
    }
    
    public void delete(){
        if (checkList(list.isEmpty()) == true) {
            return;
        }
        System.out.println("===Xoa nhan vien theo ma NV===");
        String ma = mess("ma NV muon xoa ");
        temp = index(ma);
        if (temp == -1) {
            System.out.println("===> Khong tim thay ma NV vua nhap .");
            return; 
        }
        list.remove(temp);
        System.out.println("===> Xoa thanh cong !");
    }
    
    public void update(){
        if (checkList(list.isEmpty()) == true) {
            return;
        }
        System.out.println("===Cap nhat thong tin nhan vien theo ma NV===");
        String ma = mess("ma NV muon cap nhat : ");
        temp = index(ma);
        if (temp == -1) {
            System.out.println("===> Khong tim thay ma NV vua nhap .");
            return; 
        }
        System.out.println("Cap nhat lai thong tin cua nhan vien");
        System.out.println("1 . Cap nhat lai ten NV .");
        System.out.println("2 . Cap nhat lai luong NV .");
        while (true) {
            try {
                choice = Integer.parseInt(mess("lua chon "));
                break;
            } catch (Exception e) {
                System.out.println("Lua chon nhap vao la so !");
            }
        }
        switch (choice) {
            case 1:
                String ten;
                while (true) {
                    ten = mess("ten NV cap nhat ");
                    if(ten == ""){
                        System.out.println("Ten khong duoc bo trong");
                    }else{
                        break;
                    }
                }
                list.get(temp).setName(ten);
                System.out.println("===> Cap nhat ten moi thanh cong !");
                break;
            case 2:
                double luong = Double.parseDouble(mess("luong NV cap nhat "));
                list.get(temp).setSalary(luong);
                System.out.println("===> Cap nhat luong moi thanh cong !");
                break;
            default:
                System.out.println("Lua chon chi 1 - 2");
        }
        
    }
    
    public void search_Salary(){
        int check = 0;
        if (checkList(list.isEmpty()) == true) {
            return;
        }
        double k1 = Double.parseDouble(mess("khoang luong thu 1 : "));
        double k2 = Double.parseDouble(mess("khoang luong thu 2 : "));
        if (k1 < k2) {
            for (Staff x : list) {
                if (x.getSalary() >= k1 && x.getSalary() <= k2) {
                    System.out.println(x);
                    check++;
                }
            }
        }else if(k1 > k2){
            for (Staff x : list) {
                if (x.getSalary() <= k1 && x.getSalary() >= k2) {
                    System.out.println(x);
                    check++;
                }
            }
        }
        if (check == 0) {
            System.out.println("Khong tim thay nhan vien co luong trong khoang luong vua nhap .");
        }        
    }
    
    public void Sort_name(){
        if (checkList(list.isEmpty()) == true) {
            return;
        }
        System.out.println("=== Danh sach nhan vien sau khi sap xep theo ten la ===");
        Collections.sort(list, (a,b) -> a.getName().compareTo(b.getName()));
        show();
    }
    public void Sort_income(){
        if (checkList(list.isEmpty()) == true) {
            return;
        }
        Collections.sort(list, (b,a) -> Double.compare(a.getIncome(), b.getIncome()));
    }
    public void show_Top5(){
        if (checkList(list.isEmpty()) == true) {
            return;
        }
        Sort_income();
        System.out.println("===Top 5 nhan vien co thu nhap cao nhat la : ");
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i).toString());
        }
    }
    
}
