package ss5_access_modifier.bai_tap.Access_modifier;

public class Access_modifier {
    public static class Circle {
        private double radius;
        private String color;

        public Circle(double radius, String color) {
            this.radius = radius;
        }

        public Circle(int radius) {
        }

        public double getRadius() {
            return radius;
        }
        public double getArea() {
            return Math.PI * radius * radius;
        }
        @Override
        public String toString() {
            return "Circle [radius=" + radius + ", color=" + color + "]";
        }
    }
}
