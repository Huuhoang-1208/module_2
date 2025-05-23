package ss4_lop_va_doi_tuong_trong_java.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;
    public QuadraticEquation() {

    }
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public double getDiscriminant() {
        double delta = Math.pow(b, 2) - 4 * a * c;
        return delta;
    }
    public double getRoot1() {
        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }
    public double getRoot2() {
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        QuadraticEquation eq = new QuadraticEquation(a, b, c);
        double delta = eq.getDiscriminant();
        if (delta > 0) {
            System.out.println("Phương trình có 2 nghiệm phân biệt");
            System.out.println("x1 = " + eq.getRoot1());
            System.out.println("x2 = " + eq.getRoot2());
        } else if (delta == 0) {
            System.out.println("Phương trình có nghiệm kép");
            System.out.println("x = " + eq.getRoot1());
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}

