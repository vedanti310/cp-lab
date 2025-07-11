
import java.util.Scanner;
public class TheTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            double[] expenses = new double[n];
            double total = 0;
            for (int i = 0; i < n; i++) {
                expenses[i] = sc.nextDouble();
                total += expenses[i];
            }
            double avg = total / n, give = 0;
            for (double exp : expenses) {
                if (exp > avg) give += exp - avg;
            }
            System.out.printf("$%.2f\n", give);
        }
    }
}
