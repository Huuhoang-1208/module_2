package ss6_ke_thua.bai_tap.lop_point_lop_moveablepoint;

public class test_Moveablepoint {
    public static void main(String[] args) {
        Moveablepoint m = new Moveablepoint();
        m.setX(100);
        m.setY(20);
        m.setXspeed(500);
        m.setYspeed(500);
        m.move();
        System.out.println(m);
    }
}
