package ss5_access_modifier.bai_tap;

public class test_circle {
    public static void main(String[] args) {
        Access_modifier a = new Access_modifier();
        Access_modifier.Circle c = new Access_modifier.Circle(10);
        System.out.println(c.getArea());
        System.out.println(c);
    }
}
