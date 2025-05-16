package ss1_tong_quan_java.bai_tap;
import java.util.Scanner;

public class hien_thi_loi_chao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        do {
            System.out.println("Mời nhập tên của bạn: ");
            name = scanner.nextLine();
            if (!name.equals("Hoàng")) {
                System.out.printf("Xin chào, %s!\n", name);
            }else {
                System.out.println("Chào:" + name);
            }
        } while (!name.equals("Hoàng"));
    }
}
