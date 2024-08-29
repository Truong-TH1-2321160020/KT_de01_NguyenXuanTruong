/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de01;
/**
 *
 * @author ADMIN
 */
public class CauThu {
    private int soao;
    private String hoten;
    private int namsinh;
    private int luongcung;
    private int tienthuong;
    private int tienphat;
    public CauThu(int soao, String hoten, int namsinh, int luongcung, int tienthuong, int tienphat){
        this.hoten = hoten;
        this.namsinh = namsinh;
        this.luongcung = luongcung;
        this.tienthuong = tienthuong;
        this.tienphat = tienphat;
    }
  public int getSoao(){
        return soao;
    }

    public void setSoao(int soao){
        this.soao = soao;
    }
    public String getHoten() {
        return hoten;
    }
    public void setHoten(String hoten){
        this.hoten = hoten;
    }

    public int getNamsinh(){
        return namsinh;
    }
    public void setNamsinh(int namsinh){
        this.namsinh = namsinh;
    }
    public int getLuongcung(){
        return luongcung;
    }
    public void setLuongcung(int luongcung){
        this.luongcung = luongcung;
    }
    public int getTienthuong(){
        return tienthuong;
    }
    public void setTienthuong(int tienthuong){
        this.tienthuong = tienthuong;
    }
    public int getTienphat(){
        return tienphat;
    }
    public void setTienphat(int tienphat){
        this.tienphat = tienphat;
    }
    public int tinhLuongThucLanh(){
        return luongcung + tienthuong - tienphat;
    }
}
