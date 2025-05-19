package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class them_phan_tu_vao_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                int[] array = new int[10];
                System.out.print("Nhập số lượng phần tử ban đầu (<= 10): ");
                int n = scanner.nextInt();
                for (int i = 0; i < n; i++) {
                    System.out.print("Nhập phần tử thứ " + i + ": ");
                    array[i] = scanner.nextInt();
                }
                System.out.print("Nhập giá trị cần chèn: ");
                int x = scanner.nextInt();
                System.out.print("Nhập vị trí cần chèn (từ 0 đến " + n + "): ");
                int index = scanner.nextInt();
                if (index < 0 || index > n || n >= array.length) {
                    System.out.println("Không thể chèn phần tử vào mảng.");
                } else {
                    for (int i = n; i > index; i--) {
                        array[i] = array[i - 1];
                    }
                    array[index] = x;
                    System.out.print("Mảng sau khi chèn: ");
                    for (int i = 0; i <= n; i++) {
                        System.out.print(array[i] + " ");
                    }
                    System.out.println();
                }
                scanner.close();
            }
        }

