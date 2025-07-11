
import java.util.*;
public class WheresWaldorf {
    static int[] dx = {-1,-1,-1,0,0,1,1,1};
    static int[] dy = {-1,0,1,-1,1,-1,0,1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int m = sc.nextInt(), n = sc.nextInt();
            sc.nextLine();
            char[][] grid = new char[m][n];
            for (int i = 0; i < m; i++) grid[i] = sc.nextLine().toLowerCase().toCharArray();
            int w = sc.nextInt();
            sc.nextLine();
            for (int k = 0; k < w; k++) {
                String word = sc.nextLine().toLowerCase();
                boolean found = false;
                for (int i = 0; i < m && !found; i++) {
                    for (int j = 0; j < n && !found; j++) {
                        for (int d = 0; d < 8 && !found; d++) {
                            int x = i, y = j, l = 0;
                            while (l < word.length() && x >= 0 && y >= 0 && x < m && y < n && grid[x][y] == word.charAt(l)) {
                                x += dx[d];
                                y += dy[d];
                                l++;
                            }
                            if (l == word.length()) {
                                System.out.println((i + 1) + " " + (j + 1));
                                found = true;
                            }
                        }
                    }
                }
            }
            if (T > 0) System.out.println();
        }
    }
}
