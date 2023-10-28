public class TutorialCircle {
    public static void main(String[] args) {

        Circle circle1 = new Circle();
        System.out.println("The circle has a radius of " + circle1.getRadius() + " and an area of " + circle1.getArea());

        circle1.setColour("Orange");
        circle1.setRadius(12.2);
        System.out.println("Colour: " + circle1.getRadius());
        System.out.println("Radius: " + circle1.getColour());

        Circle circle2 = new Circle(8);

        System.out.println("The circle has a radius of " + circle2.getRadius() + " and an area of " + circle2.getArea());

        System.out.println(circle1.getRadius());
        circle1.setRadius(10);


        Circle circle3 = new Circle(12, "Red");
        circle3.setRadius(14);
        circle3.setColour("Green");


        System.out.println(circle3.toString());
        System.out.println(circle3);
    }
}