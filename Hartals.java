
import java.util.Scanner;
public class Hartals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int P = sc.nextInt();
            boolean[] days = new boolean[N + 1];
            for (int i = 0; i < P; i++) {
                int h = sc.nextInt();
                for (int j = h; j <= N; j += h) {
                    if (j % 7 != 6 && j % 7 != 0) days[j] = true;
                }
            }
            int count = 0;
            for (int i = 1; i <= N; i++) if (days[i]) count++;
            System.out.println(count);
        }
    }
}
