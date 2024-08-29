/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de01;
import java.util.ArrayList;
/**
 *
 * @author ADMIN
 */
public class QLCauThu {
     private final  ArrayList<CauThu> ds = new ArrayList<>();
      public QLCauThu() {
        ds.add(new CauThu(1, "Nguyen An", 2000, 900, 500, 200));
        ds.add(new CauThu(2, "Tran Vu", 1999, 1100, 600, 100));
        ds.add(new CauThu(3, "Le Van Lam", 1998, 1300, 300, 50));
        ds.add(new CauThu(4, "Hoang Thi Ngu", 1999, 1100, 700, 300));
        ds.add(new CauThu(5, "Pham Van EM", 1994, 1600, 400, 150));
        ds.add(new CauThu(6, "Vu Thi Canh", 1994, 1600, 800, 200));
        ds.add(new CauThu(7, "Nguyen Thy", 1991, 2000, 300, 100));
        ds.add(new CauThu(8, "Tran Sang Hy", 1997, 1800, 900, 500));
        ds.add(new CauThu(9, "Le Thi", 1988, 1700, 500, 200));
        ds.add(new CauThu(10, "Hoang Van Nam", 1999, 1100, 1000, 300));
        ds.add(new CauThu(11, "Pham Trung Khanh", 2000, 900, 700, 100));
    }
      //A
          public void themCauThu(CauThu cauThu) {
        for (CauThu ct : ds) {
            if (ct.getSoao() == cauThu.getSoao()) {
                System.out.println("Cầu Thủ Đã TỒn Tại!");
                return;
            }
        }
        ds.add(cauThu);
        System.out.println("Thêm cầu thủ thành công!");
    }
      //D
          public void timCauThuLuongCaoNhat() {
    if (ds.isEmpty()) {
        System.out.println("Danh sách cầu thủ rỗng.");
        return;
    
    ArrayList<CauThu> cauThuMaxList = new ArrayList<>();
        for (CauThu cauThu : ds) {
            int maxLuongThucLanh = 0;
            if (cauThu.tinhLuongThucLanh() == maxLuongThucLanh) {
                cauThuMaxList.add(cauThu);
            }
        }

        System.out.println("Các cầu thủ có lương thực lãnh cao nhất:");
        for (CauThu cauThu : cauThuMaxList) {
            System.out.println(cauThu);
        }
    }
          }
}
