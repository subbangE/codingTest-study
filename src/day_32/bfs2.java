import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Queue;

public class bfs2 {

    // 항해99 코딩테스트 스터디 3기 - 32일차
    // Bad Grass

    // 방향 벡터 (상, 하, 좌, 우, 좌상, 우상, 좌하, 우하)
    static int[] dx = {-1, 1, 0, 0, -1, -1, 1, 1};
    static int[] dy = {0, 0, -1, 1, -1, 1, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int[][] map = new int[R][C];

        // 지도 입력 받기
        for (int i = 0; i < R; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < C; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int islandCount = 0;

        // 모든 칸을 탐색하면서 섬의 개수 세기
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                // 섬을 찾았으면 BFS를 통해 연결된 모든 부분을 방문 처리
                if (map[i][j] > 0) {
                    bfs(map, i, j, R, C);
                    islandCount++;
                }
            }
        }

        System.out.println(islandCount);
    }

    // BFS 탐색
    static void bfs(int[][] map, int x, int y, int R, int C) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        map[x][y] = 0;  // 방문 표시

        while (!queue.isEmpty()) {
            int[] point = queue.poll();
            int px = point[0];
            int py = point[1];

            for (int i = 0; i < 8; i++) {
                int nx = px + dx[i];
                int ny = py + dy[i];

                if (nx >= 0 && nx < R && ny >= 0 && ny < C && map[nx][ny] > 0) {
                    map[nx][ny] = 0;  // 방문 표시
                    queue.add(new int[]{nx, ny});
                }
            }
        }
    }
}
