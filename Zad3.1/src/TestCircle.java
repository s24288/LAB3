public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(15);
        Circle circle3 = new Circle(8, "Yellow");
        Circle circle4 = new Circle();

        circle4.setRadius(20);
        circle4.setColor("Brown");

        System.out.println("circle1: ");
        circle1.printAll();

        System.out.println("circle2: ");
        circle2.printAll();

        System.out.println("circle3: ");
        circle3.printAll();

        System.out.println("circle4: ");
        circle4.printAll();



    }
}
