
import java.util.Scanner;
public class ThreeNPlusOne {
    static int cycleLength(int n) {
        int count = 1;
        while (n != 1) {
            if (n % 2 == 0)
                n /= 2;
            else
                n = 3 * n + 1;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int i = sc.nextInt(), j = sc.nextInt();
            int maxCycle = 0;
            for (int k = Math.min(i, j); k <= Math.max(i, j); k++) {
                maxCycle = Math.max(maxCycle, cycleLength(k));
            }
            System.out.println(i + " " + j + " " + maxCycle);
        }
    }
}
