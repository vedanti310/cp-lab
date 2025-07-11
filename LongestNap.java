
import java.util.*;
public class LongestNap {
    static int toMin(String t) {
        String[] parts = t.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }
    static String toTime(int min) {
        return String.format("%02d:%02d", min / 60, min % 60);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = 1;
        while (sc.hasNext()) {
            int n = sc.nextInt();
            sc.nextLine();
            List<int[]> intervals = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String[] parts = sc.nextLine().split(" ", 3);
                int start = toMin(parts[0]);
                int end = toMin(parts[1]);
                intervals.add(new int[]{start, end});
            }
            intervals.add(new int[]{600, 600}); // 10:00
            intervals.add(new int[]{1080, 1080}); // 18:00
            intervals.sort(Comparator.comparingInt(a -> a[0]));
            int maxNap = 0, napStart = 600;
            for (int i = 1; i < intervals.size(); i++) {
                int nap = intervals.get(i)[0] - intervals.get(i - 1)[1];
                if (nap > maxNap) {
                    maxNap = nap;
                    napStart = intervals.get(i - 1)[1];
                }
            }
            System.out.printf("Day #%d: the longest nap starts at %s and will last for %d minutes.\n",
                    day++, toTime(napStart), maxNap);
        }
    }
}
