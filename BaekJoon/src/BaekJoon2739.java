import java.util.Scanner;

public class BaekJoon2739 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.printf("%d * %d = %d%n", n, i, n*i);
        }
    }
}
