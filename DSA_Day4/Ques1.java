package DSA_Day4;

public class Ques1 {
  
    public static void main(String[] args) {
        GeometryCalculator calc = new GeometryCalculator();

        System.out.println("Circle area (r=5): " + calc.calculateArea(5.0));
        System.out.println("Rectangle area (4,6): " + calc.calculateArea(4, 6));
        System.out.println("Triangle area (8.0, 5.0): " + calc.calculateArea(8.0, 5.0, true));
    }

}
class GeometryCalculator {
     public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Rectangle: area = length * width
    public int calculateArea(int length, int width) {
        return length * width;
    }

    // Triangle: area = (base * height) / 2
    // boolean isTriangle just changes the signature
    public double calculateArea(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return (base * height) / 2.0;
        }
        return 0.0; // invalid flag
    }
    // Inherits all area calculation methods
}
