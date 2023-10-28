public class Circle {

    private double radius;
    private String colour;


    public Circle() {
        this.radius = 1;
        this.colour = "Blue";
    }

    public Circle(double radius) {
        this.radius = radius;
        this.colour = "Blue";
    }

    public Circle(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public String getColour() {
        return this.colour;
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public void setColour(String newColour) {
        this.colour = newColour;
    }

    @Override
    public String toString() {
        return "Colour: " + this.colour + "\n" + "Radius: " + this.radius;
    }
}

// protected = accessible within the same package and by children of the parent class in
// another package