
import java.util.Scanner;
import java.util.HashSet;
public class JollyJumpers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            HashSet<Integer> diffs = new HashSet<>();
            for (int i = 1; i < n; i++) {
                diffs.add(Math.abs(arr[i] - arr[i - 1]));
            }
            boolean jolly = true;
            for (int i = 1; i < n; i++) {
                if (!diffs.contains(i)) {
                    jolly = false;
                    break;
                }
            }
            System.out.println(jolly ? "Jolly" : "Not jolly");
        }
    }
}
