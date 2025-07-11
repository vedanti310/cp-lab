
import java.util.Scanner;
public class WERTYU {
    public static void main(String[] args) {
        String keys = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            StringBuilder result = new StringBuilder();
            for (char c : line.toCharArray()) {
                int index = keys.indexOf(c);
                result.append(index > 0 ? keys.charAt(index - 1) : c);
            }
            System.out.println(result);
        }
    }
}
