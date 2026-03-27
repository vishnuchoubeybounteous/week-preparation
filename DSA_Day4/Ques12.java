package DSA_Day4;

public class Ques12 {
    public static void hanoi(int n, char src, char aux, char dst) {
        if (n == 1) {
            System.out.println("Move disk 1 from "+src+" to "+dst);
            return;
        }
        hanoi(n - 1, src, dst, aux);
        System.out.println("Move disk "+n+" from "+src+" to "+dst);
        hanoi(n - 1, aux, src, dst);
    }

    public static void main(String[] args) {
        hanoi(5, 'A', 'B', 'C');
    }
}
