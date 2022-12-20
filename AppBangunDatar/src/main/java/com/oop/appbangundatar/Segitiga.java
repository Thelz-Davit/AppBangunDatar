/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.appbangundatar;

/**
 *
 * @author User
 */
public class Segitiga extends BangunDatar{

    private double alas;
    private double tinggi;
    private double sisi;

    public Segitiga(double alas, double tinggi, double sisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi = sisi;
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
    
    @Override
    double luas() {
       return 0.5 * alas * tinggi;
    }

    @Override
    double keliling() {
       return alas + tinggi + sisi; 
    }
    
}
