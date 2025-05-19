package ss2_vong_lap_java.bai_tap;
import java.util.Scanner;

public class cac_so_nguyen_to_nho_hon_100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cac_so_nguyen_to_nho_hon_100 min = new cac_so_nguyen_to_nho_hon_100();
        System.out.println("nhap cac so nguyen to nho hon 100 ");
        for ( int i = 0; i < 100; i++){
            if (min.checkSNT(i)){
                System.out.println(i + " ");
            }
        }

    }

    public boolean checkSNT(int n ) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}


