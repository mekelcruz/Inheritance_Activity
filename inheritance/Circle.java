public class Circle extends Shape {
    private final double radius;

    public Circle(String color, String texture, double radius) {
        super(color, texture);
        this.radius = radius;
    }

    public double getRadius() {
        return 3.14 * radius * radius;
    }
}