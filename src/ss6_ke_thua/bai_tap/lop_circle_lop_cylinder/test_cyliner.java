package ss6_ke_thua.bai_tap.lop_circle_lop_cylinder;

import java.util.Scanner;

public class test_cyliner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cylinder c = new cylinder();
        System.out.println("Nhập bán kính hình trụ");
        c.setRadius(Double.parseDouble(sc.nextLine()));
        System.out.println("Nhập màu: ");
        cylinder.setColor(sc.nextLine());
        System.out.println("Nhập chiều cao hình trụ: ");
        c.setHeight(Double.parseDouble(sc.nextLine()));
        boolean cylinder = false;
        System.out.println(cylinder);
    }
}
