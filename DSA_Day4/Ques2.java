package DSA_Day4;

public class Ques2 {
    public static double calculateAverage(double... numbers) {
        if (numbers.length == 0) return 0.0;
        double sum = 0;
        for (double x : numbers) {
            sum += x;
        }
        return sum / numbers.length;
    }

    public static void main(String[] args) {
        System.out.println("Average is: " + calculateAverage(10, 20, 30));
        System.out.println("Average is: " + calculateAverage(1.5, 2.5));
        System.out.println("Average is: " + calculateAverage(5.0, 10.0, 15.0, 20.0));
    }
}

