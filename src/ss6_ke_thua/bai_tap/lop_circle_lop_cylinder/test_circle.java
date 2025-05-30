package ss6_ke_thua.bai_tap.lop_circle_lop_cylinder;
import java.util.Scanner;

public class test_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập bán kính hình tròn: ");
        double radius = Double.parseDouble(sc.nextLine());
        String color = sc.nextLine();
        circle circle = new circle(radius, color);
        System.out.println("Nhập màu sắc: ");
        System.out.println(circle);
    }
}

