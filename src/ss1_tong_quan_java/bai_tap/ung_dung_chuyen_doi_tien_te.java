package ss1_tong_quan_java.bai_tap;
import java.util.Scanner;
public class ung_dung_chuyen_doi_tien_te {
    public static void main (String [] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mòi bạn nhập số tiền cần quy đổi : ");
        usd = sc.nextDouble();;
        double quydoi = usd * 23000;
        System.out.print( "Giá trị VND" + quydoi);
    }
}


