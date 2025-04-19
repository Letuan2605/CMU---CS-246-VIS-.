/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TimSoLonNhat;

/**
 *
 * @author ADMIN
 */
public class SoLonNhat {
    public static int findMaxNum(int[] arr) {
        if (arr.length == 0) throw new IllegalArgumentException("Array is empty");
        int max = arr[0];
        for (int x : arr) {
            if (x > max) max = x;
        }
        return max;
    }
}
