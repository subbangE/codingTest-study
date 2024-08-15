import java.util.*;

public class graph2 {

    // 항해99 코딩테스트 스터디 3기 - 25일차
    // Find if Path Exists in Graph(그래프에 경로가 존재하는지 확인)

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] b = new boolean[n];

        if (source == destination) {
            return true;
        }

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            list.get(edge[0]).add(edge[1]);
            list.get(edge[1]).add(edge[0]);
        }

        q.add(source);
        b[source] = true;

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int num : list.get(node)) {
                if (num == destination) {
                    return true;
                }
                if (!b[num]) {
                    b[num] = true;
                    q.add(num);
                }
            }
        }

        return false;
    }
}