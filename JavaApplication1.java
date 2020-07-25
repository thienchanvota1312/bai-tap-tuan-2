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
public class JavaApplication1 {
    private static final Scanner scanner = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Nhập số nguyên dương a = ");
        int a = scanner.nextInt();
        System.out.print("Nhập số nguyên dương b = ");
        int b = scanner.nextInt();
        // tính USCLN của a và b
        System.out.println("USCLN của " + a + " và " + b
                + " là: " + gcd(a, b));
        System.out.println("fibonacci của " + a + " là: " + fibonacci(a));
        System.out.println("Các số nguyên tố từ 1 đến " + a + " là: ");
        sieveEratosthenes(a);
    }
     public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
     public static int fibonacci(int n) {
       if (n < 0) {
           return -1;
       } else if (n == 0 || n == 1) {
           return n;
       } else {
           return fibonacci(n - 1) + fibonacci(n - 2);
       }
   }
    public static void sieveEratosthenes(int n) {
    boolean[] check = new boolean[n + 1];
    for (int i = 2; i <= n; i++) {
      check[i] = true;
    }
    for (int i = 2; i <= n; i++) {
      if (check[i] == true) {
        for (int j = 2 * i; j <= n; j += i) {
          check[j] = false;
        }
      }
    }
    for (int i = 2; i <= n; i++) {
      if (check[i] == true) {
        System.out.print(i + " ");
      }
    }
    }
}
