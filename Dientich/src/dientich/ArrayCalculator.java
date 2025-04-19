/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dientich;

/**
 *
 * @author ADMIN
 */
public class ArrayCalculator {

    public static void main(String[] args) {
        //doi ten bien arr thanh so
        int[] mangso = {1,2,3,4,5,6,7,8};
        //kiem tra mang co rong khong
        if (mangso.length == 0) {
            System.out.println("mang rong vui long nhap lai! ");
        } else {
            int sum = 0;
            sum = calculatesum(mangso, sum);
            System.out.println("Tong la: " + sum);
            double Tbinh = trungBinhTong(sum, mangso);
            System.out.println("Trung binh la: " + Tbinh);
        }
    }
    //trich xuat logic trung binh thanh phuong thuc rieng
    private static double trungBinhTong(int sum, int[] so) {
        //ep kieu double de no co the in ra so thap phan
        double avg = (double) sum / so.length;
        return avg;
    }
    //trich xuat logic tinh tong thanh phuong thuc rieng
    private static int calculatesum(int[] so, int sum) {
        for (int i = 0; i < so.length; i++) {
            sum = sum + so[i];
        }
        return sum;
    }

}


