
import java.util.Scanner;
public class Ones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int num = 1, length = 1;
            while (num % n != 0) {
                num = (num * 10 + 1) % n;
                length++;
            }
            System.out.println(length);
        }
    }
}
