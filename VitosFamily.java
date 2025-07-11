
import java.util.Arrays;
import java.util.Scanner;
public class VitosFamily {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            Arrays.sort(arr);
            int median = arr[n / 2];
            int sum = 0;
            for (int x : arr) sum += Math.abs(x - median);
            System.out.println(sum);
        }
    }
}
