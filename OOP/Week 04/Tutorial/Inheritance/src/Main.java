import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.####");

        Circle circle = new Circle(5);

        Cylinder cylinder = new Cylinder(5);

        System.out.println(df.format(circle.getArea()));
        System.out.println(df.format(cylinder.getArea()));

        System.out.println(cylinder.getVolume());

        System.out.println(cylinder);

    }
}
