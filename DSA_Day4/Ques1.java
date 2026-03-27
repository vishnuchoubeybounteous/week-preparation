package DSA_Day4;

public class Ques1 {
  
    public static void main(String[] args) {
        GeoCalc calc = new GeoCalc();
        System.out.println("Circle area: " + calc.calculateArea(5.0));
        System.out.println("Rectangle area: " + calc.calculateArea(4, 6));
        System.out.println("Triangle area: " + calc.calculateArea(8.0, 5.0, true));
    }

}
class GeoCalc{
     public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    public int calculateArea(int length, int width) {
        return length * width;
    }
    public double calculateArea(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return (base * height) / 2.0;
        }
        return 0.0;
    }
}
