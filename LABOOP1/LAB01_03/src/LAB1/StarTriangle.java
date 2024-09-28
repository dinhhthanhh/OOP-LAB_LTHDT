package LAB1;
import java.util.*;
public class StarTriangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        scanner.close();
	}
}
