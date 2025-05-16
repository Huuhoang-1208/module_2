package ss2_vong_lap_java.bai_tap;
import java.util.Scanner;

public class hien_thi_cac_loai_hinh {
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("\t1. Print the rectangle");
        System.out.println("\t2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("\t3. Print isosceles triangle");
        System.out.println("\t4. Exit");
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while ( choice != 4 ) {
            System.out.println(" Vui lòng chọn các chức năng: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    printRectangle();
                    break;
                case 2:
                    System.out.println("Submenu: ");
                    System.out.println("\t1. top-left: ");
                    System.out.println("\t2. top-right: ");
                    System.out.println("\t3. bottom-left: ");
                    System.out.println("\t4. bottom-right: ");
                    System.out.println("\t5. Exit");
                    int subMenuChoice = 0;
                    while ( subMenuChoice != 5 ) {
                        System.out.print("Vui lòng chọn các chức năng con:");
                        subMenuChoice = scanner.nextInt();
                        switch (subMenuChoice) {
                            case 1:
                                for ( int i = 5; i >= 0; i--) {
                                    for (int j = 1; j <= i; j++) {
                                        System.out.print("* ");
                                    }
                                    System.out.println();
                                }
                                break;
                            case 2:
                                break;
                            case 3:
                                for ( int i = 1; i <= 5; i++ ) {
                                    for (int j = 1; j <= i; j++) {
                                        System.out.print("* ");
                                    }
                                    System.out.println();
                                }
                                break;
                            case 4:
                                break;
                            case 5:
                                System.out.println("Exit");
                                break;
                            default:
                                System.out.println("Chọn sai chức năng");
                                break;
                        }
                    }
                    break;
                case 3:
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.print("Nhập sai!");
            }
        }
    }
    private static void printRectangle() {
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 7; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}

