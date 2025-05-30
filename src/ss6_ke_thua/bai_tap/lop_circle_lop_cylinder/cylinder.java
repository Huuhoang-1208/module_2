package ss6_ke_thua.bai_tap.lop_circle_lop_cylinder;

import java.util.Scanner;

public class cylinder extends circle {
    private double height;

    public cylinder() {
        super();
        this.height = 1.0;
    }
    public cylinder(double radius, double height) {
        super();
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        Scanner sc = new Scanner(System.in);
        return "Cylinder [radius=" + super.getRadius() + ", color=" + super.setColor(sc.nextLine()) + ", height=" + height + ", volume=" + getVolume() + "]";
    }
}
