package ss2_vong_lap_java.bai_tap;
import java.util.Scanner;

public class hien_thi_20_nguyen_to {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        hien_thi_20_nguyen_to obj = new hien_thi_20_nguyen_to();
        System.out.println("Nhap so luong so nguyen to muon hien thi: ");
        int num = Integer.parseInt(sc.nextLine());
        int countSNT = 0;
        int i = 0;
        while (countSNT < num) {
            if (obj.checkSNT(i)) {
                System.out.print(i + " ");
                countSNT++;
            }
            i++;
        }
    }
    public boolean checkSNT (int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
