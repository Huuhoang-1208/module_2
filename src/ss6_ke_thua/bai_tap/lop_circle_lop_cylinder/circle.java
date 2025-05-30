package ss6_ke_thua.bai_tap.lop_circle_lop_cylinder;

public class circle {
    private double radius;
    private static String color;

    public circle() {
        radius = 0.1;
        color = "black";
    }

    public circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public static String setColor(String s) {
        return color;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "circle{" + "radius=" + radius + ", color=" + color + '}';
    }

    protected String getColor() {

        return "";
    }
}

