import java.util.*;
public class TCS1 {

    static boolean equalLists(List<String> a, List<String> b) {
        if (a.size() != b.size()) return false;
        for (int i = 0; i < a.size(); i++) {
            if (!a.get(i).equals(b.get(i))) return false;
        }
        return true;
    }

    static List<String> cutAndInsert(List<String> list, int l, int r, int pos) {
        List<String> result = new ArrayList<>();
        List<String> segment = new ArrayList<>(list.subList(l, r + 1));

        for (int i = 0; i < list.size(); i++) {
            if (i < l || i > r) result.add(list.get(i));
        }
        if (pos > result.size()) pos = result.size();
        result.addAll(pos, segment);
        return result;
    }

    static String key(List<String> list) {
        return String.join("§", list);   // unique encoding
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine().trim());
        sc.nextLine(); // "shuffled"
        List<String> shuffled = new ArrayList<>();
        for (int i = 0; i < N; i++) shuffled.add(sc.nextLine().trim());
        sc.nextLine(); // "original"
        List<String> original = new ArrayList<>();
        for (int i = 0; i < N; i++) original.add(sc.nextLine().trim());

        if (equalLists(shuffled, original)) {
            System.out.println(0);
            return;
        }

        // --- BFS over all possible states ---
        Queue<List<String>> q = new ArrayDeque<>();
        Queue<Integer> depth = new ArrayDeque<>();
        Set<String> seen = new HashSet<>();

        q.add(shuffled);
        depth.add(0);
        seen.add(key(shuffled));

        while (!q.isEmpty()) {
            List<String> cur = q.poll();
            int d = depth.poll();

            // Generate every possible cut and insert
            for (int l = 0; l < N; l++) {
                for (int r = l; r < N; r++) {
                    for (int pos = 0; pos <= N; pos++) {
                        if (pos >= l && pos <= r + 1) continue;
                        List<String> next = cutAndInsert(cur, l, r, pos);
                        String k = key(next);
                        if (seen.contains(k)) continue;
                        if (equalLists(next, original)) {
                            System.out.println(d + 1);
                            return;
                        }
                        seen.add(k);
                        q.add(next);
                        depth.add(d + 1);
                    }
                }
            }
        }
    }
}