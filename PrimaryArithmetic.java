
import java.util.Scanner;
public class PrimaryArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt(), b = sc.nextInt();
            if (a == 0 && b == 0) break;
            int carry = 0, count = 0;
            while (a > 0 || b > 0) {
                if ((a % 10 + b % 10 + carry) >= 10) {
                    carry = 1;
                    count++;
                } else {
                    carry = 0;
                }
                a /= 10;
                b /= 10;
            }
            if (count == 0) System.out.println("No carry operation.");
            else if (count == 1) System.out.println("1 carry operation.");
            else System.out.println(count + " carry operations.");
        }
    }
}
