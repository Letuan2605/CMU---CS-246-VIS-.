/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dientich;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class CircleAreaCalculator {
    public double calculateArea(double radius){
           double pi = 3.14;
           double area = pi*radius*radius ;
           return area;
    }
    public static void main(String[] args) {
        CircleAreaCalculator s = new CircleAreaCalculator();
        double Dt = s.calculateArea(5);
        System.out.println("dien tich : "+Dt);
    }
}
