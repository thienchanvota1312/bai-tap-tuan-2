/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author CCNE
 */
public class Fraction {
    private int numerator;
    private int denominator;
    /**
    khởi tạo
     */
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    /**
    getter, setter cho các thuộc tính
     */
    public int getnumerator() {
        return numerator;
    }    
    public void setnumerator(int numerator) {
        this.numerator = numerator;
    }
     
     
    public int getdenominator() {
        return denominator;
    }
    public void setdenominator(int denominator) {
        this.denominator = denominator;
    }
    /**
    Tối giản
     */
    public void reduce() {
        int i = gcd(this.getnumerator(), this.getdenominator());
        this.setnumerator(this.getnumerator() / i);
        this.setdenominator(this.getdenominator() / i);
    }
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    /**
    cộng trừ nhân chia ps
     */
    public void add(Fraction ps) {
        int ts = this.getnumerator() * ps.getdenominator() + ps.getnumerator() * this.getdenominator();
        int ms = this.getdenominator() * ps.getdenominator();
        Fraction phanSoTong = new Fraction(ts, ms);
        phanSoTong.reduce();
        System.out.println("Tổng hai phân số = " + phanSoTong.numerator + "/" + phanSoTong.denominator);
    }
      
    public void subtract(Fraction ps) {
        int ts = this.getnumerator() * ps.getdenominator() - ps.getnumerator() * this.getdenominator();
        int ms = this.getdenominator() * ps.getdenominator();
        Fraction phanSoHieu = new Fraction(ts, ms);
        phanSoHieu.reduce();
        System.out.println("Hiệu hai phân số = " + phanSoHieu.numerator + "/" + phanSoHieu.denominator);
    }
     
    public void multiply(Fraction ps) {
        int ts = this.getnumerator() * ps.getnumerator();
        int ms = this.getdenominator() * ps.getdenominator();
        Fraction phanSoTich = new Fraction(ts, ms);
        phanSoTich.reduce();
        System.out.println("Tích hai phân số = " + phanSoTich.numerator + "/" + phanSoTich.denominator);
    }
     
    public void divide(Fraction ps) {
        int ts = this.getnumerator() * ps.getdenominator();
        int ms = this.getdenominator() * ps.getnumerator();
        Fraction phanSoThuong = new Fraction(ts, ms);
        phanSoThuong.reduce();
        System.out.println("Thương hai phân số = " + phanSoThuong.numerator + "/" + phanSoThuong.denominator);
    }
    /**
    equals
    */
    public boolean equals(Object object){
        if (obj instanceof Fraction) {
            Fraction other = (Fraction) object;
            int numerator_a = this.numerator * other.getdenominator();
            int numerator_b = other.getnumerator() * this.denominator;

            if(numerator_a == numerator_b)
                return true;
        }
        return false;
    }
   
}
