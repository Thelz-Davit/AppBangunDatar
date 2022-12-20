/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.appbangundatar;

/**
 *
 * @author user
 */
public class Lingkaran extends BangunDatar {

    private double phi = 3.14;
    private double radius;

    @Override
    public String getNamaBangunDatar() {
        return super.getNamaBangunDatar();
    }
    

    @Override
    public void setNamaBangunDatar(String namaBangunDatar) {
        super.setNamaBangunDatar(namaBangunDatar);

    }

    public Lingkaran(double radius, String namaBangunDatar) {
        super(namaBangunDatar);
        this.radius = radius;
    }

    public double getPhi() {
        return phi;
    }

    public void setPhi(double phi) {
        this.phi = phi;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double luas() {
        return phi * radius * radius;

    }

    @Override
    double keliling() {
        return 2 * phi * radius;

    }

}
