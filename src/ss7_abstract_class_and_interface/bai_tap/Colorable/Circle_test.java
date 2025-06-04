package ss7_abstract_class_and_interface.bai_tap.Colorable;

public class Circle_test implements IColorable{
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
    }

    @Override
    public void howToColor() {

    }
}
