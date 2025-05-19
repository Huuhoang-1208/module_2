package ss3_mang_va_phuong_thuc_trong_java.bai_tap;
import java.util.Scanner;

public class Xoa_phan_tu_khoi_mang {
    public static void main(String[] args) {
        int[] numbers = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0,};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần từ cần xóa: ");
        int x = scanner.nextInt();
        int index_del = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                index_del = i;
            }
        }
        for (int i = index_del; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1];
        }
        numbers[numbers.length - 1] = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}