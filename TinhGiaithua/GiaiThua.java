/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhGiaithua;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class GiaiThua {
    public static long calFactorial(int n) {
        if (n == 0 || n == 1) return 1;
        long ketqua = 1;
        for (int i = 2; i <= n; i++) {
            ketqua *= i;
        }
        return ketqua;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;
        n= sc.nextInt();
        System.out.println("tinh giai thua");
        long kq= calFactorial(n);
        System.out.println("giai thua cua "+n+"la :"+kq);
    }
}
