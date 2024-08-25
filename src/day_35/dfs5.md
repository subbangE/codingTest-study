# 99클럽 스터디 35일차 TIL + 키워드 DFS(깊이 우선 탐색)
> 2024-08-25 일요일

해시태그: #99클럽 #코딩테스트준비 #개발자취업 #항해99 #TIL

### 문제
![35일차 문제-1](https://github.com/user-attachments/assets/4a4b578b-3d59-44ff-ab4b-2e2cc35b866e)
![35일차 문제-2](https://github.com/user-attachments/assets/5f1e2203-09ee-4d32-831e-6c8a3c239b81)

### 내가 푼 풀이
👉 [문제풀이](https://github.com/subbangE/codingTest-study/blob/master/src/day_35/dfs5.java)

### 접근 방법 및 풀이 해석
```
public class dfs5 {

    static int x; // 모눈종이의 너비 (N)
    static int y; // 모눈종이의 높이 (M)
    static List<Integer> answer = new ArrayList<>(); // 영역의 크기를 저장할 리스트
    static int size; // 현재 탐색 중인 영역의 크기

    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in)); // 입력 받기
        StringTokenizer st = new StringTokenizer(b.readLine()); // 첫 번째 줄 읽기

        y = Integer.parseInt(st.nextToken()); // 모눈종이의 높이
        x = Integer.parseInt(st.nextToken()); // 모눈종이의 너비
        int rectangleCount = Integer.parseInt(st.nextToken()); // 직사각형의 개수

        // 모눈종이 배열 생성
        boolean[][] grid = new boolean[y][x];

        // 직사각형 그리기
        for (int i = 0; i < rectangleCount; i++) {
            st = new StringTokenizer(b.readLine());
            int x1 = Integer.parseInt(st.nextToken()); // 직사각형 왼쪽 아래 x좌표
            int y1 = Integer.parseInt(st.nextToken()); // 직사각형 왼쪽 아래 y좌표
            int x2 = Integer.parseInt(st.nextToken()); // 직사각형 오른쪽 위 x좌표
            int y2 = Integer.parseInt(st.nextToken()); // 직사각형 오른쪽 위 y좌표

            // 직사각형의 범위에 해당하는 부분을 true로 설정
            for (int row = y1; row < y2; row++) {
                for (int col = x1; col < x2; col++) {
                    grid[row][col] = true;
                }
            }
        }

        // 빈 공간의 영역을 찾기
        boolean[][] visited = new boolean[y][x];
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (!grid[i][j] && !visited[i][j]) { // 빈 공간이면서 아직 방문하지 않은 곳
                    size = 0; // 새 영역의 크기 초기화
                    dfs(grid, visited, j, i); // DFS를 통해 영역 탐색
                    answer.add(size); // 영역 크기 저장
                }
            }
        }

        // 영역 크기 정렬
        Collections.sort(answer);

        // 결과 출력
        System.out.println(answer.size()); // 영역의 개수 출력
        StringBuilder result = new StringBuilder();
        for (int area : answer) {
            result.append(area).append(" ");
        }
        System.out.println(result.toString().trim()); // 각 영역의 크기 출력
    }

    // DFS 탐색을 통해 빈 공간의 크기를 구하는 메서드
    static void dfs(boolean[][] grid, boolean[][] visited, int x, int y) {
        if (x < 0 || x >= grid[0].length || y < 0 || y >= grid.length || visited[y][x] || grid[y][x]) {
            return; // 경계나 방문된 곳, 직사각형 영역이면 반환
        }

        visited[y][x] = true; // 현재 위치 방문 처리
        size++; // 현재 영역의 크기 증가

        // 4방향 탐색
        dfs(grid, visited, x + 1, y); // 오른쪽
        dfs(grid, visited, x - 1, y); // 왼쪽
        dfs(grid, visited, x, y + 1); // 위쪽
        dfs(grid, visited, x, y - 1); // 아래쪽
    }
}

```

### 느낀점
알다가도 모르겠는 DFS...ㅜㅜ
