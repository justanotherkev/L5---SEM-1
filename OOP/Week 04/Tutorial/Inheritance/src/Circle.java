public class Circle {

    private double radius;
    private String colour;


    public Circle() {
        this(1, "Blue");
//        this.radius = 1;
//        this.colour = "Blue";
    }

    public Circle(double radius) {
        this(radius, "blue");
//        this.radius = radius;
//        this.colour = "Blue";
    }

    public Circle(double radius, String colour) {
//      this(1,"blue"); // Throws ERROR: recursive constructor invocation
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
        return "\nColour: " + this.colour + "\nRadius: " + this.radius;
    }
}

// protected = accessible within the same package and by children of the parent class in
// another package