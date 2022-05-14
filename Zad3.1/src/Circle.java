public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 10;
        this.color = "Black";
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "Green";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printAll() {
        System.out.println("Radius: " + getRadius() + ". Area: " + getArea() + ". Color: " + getColor());
    }
}
