public class Shapes {
    public static void main(String[] args) {
        Circle circle = new Circle(10.0);
        circle.setFillColor("Black");
        circle.setBorderColor("White");
        circle.printCharacteristics();

        Rectangle reсtangle = new Rectangle(5, 10);
        reсtangle.setFillColor("Green");
        reсtangle.setBorderColor("Yellow");
        reсtangle.printCharacteristics();

        Triangle triangle = new Triangle(100, 100, 100);
        triangle.setFillColor("Brown");
        triangle.setBorderColor("Navy");
        triangle.printCharacteristics();
    }
}