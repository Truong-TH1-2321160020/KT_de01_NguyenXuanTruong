/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package de01;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public interface Program {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("== Menu Quản Lý Cầu Thủ ==");
            System.out.println("a.");
            System.out.println("b.");
            System.out.println("c.");
            System.out.println("d.");
            System.out.println("e.");
            System.out.println("f. Thoát");
            System.out.print("Chọn chức năng (a-f):");
            
            try {
                choice = scanner.nextInt();
                scanner.nextLine();
                
                switch (choice) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    default:
                }
}
