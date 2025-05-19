package ss3_mang_va_phuong_thuc_trong_java.bai_tap;
import java.util.Scanner;

public class phan_tu_lon_trong_mang_2_chieu {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double[][] matrix;
            int choice;
            System.out.println("Chọn chế độ:");
            System.out.println("1. Dùng ma trận có sẵn");
            System.out.println("2. Nhập ma trận từ bàn phím");
            System.out.print("Lựa chọn của bạn: ");
            choice = scanner.nextInt();
            if (choice == 1) {
                matrix = new double[][]{
                        {1.2, 3.4, 5.6},
                        {7.8, 9.1, 0.5},
                        {2.3, 4.5, 6.7}
                };
            } else if (choice == 2) {
                System.out.print("Nhập số hàng: ");
                int rows = scanner.nextInt();
                System.out.print("Nhập số cột: ");
                int cols = scanner.nextInt();
                matrix = new double[rows][cols];
                System.out.println("Nhập các phần tử của ma trận:");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        System.out.print("matrix[" + i + "][" + j + "] = ");
                        matrix[i][j] = scanner.nextDouble();
                    }
                }
            } else {
                System.out.println("Lựa chọn không phù hợp1.");
                return;
            }
            double max = matrix[0][0];
            int maxRow = 0;
            int maxCol = 0;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] > max) {
                        max = matrix[i][j];
                        maxRow = i;
                        maxCol = j;
                    }
                }
            }

            System.out.println("Phần tử lớn nhất là: " + max);
            System.out.println("Tọa độ: [" + maxRow + "][" + maxCol + "]");
            scanner.close();
        }
    }

