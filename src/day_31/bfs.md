# 99클럽 스터디 31일차 TIL + 키워드 BFS(너비 우선 탐색)
> 2024-08-21 수요일

해시태그: #99클럽 #코딩테스트준비 #개발자취업 #항해99 #TIL

### 문제
![31일차 문제-1](https://github.com/user-attachments/assets/2d70a416-997e-4ad9-8427-db2fadd739e1)
![31일차 문제-2](https://github.com/user-attachments/assets/d4695011-11df-4096-9783-01f1dbf3e45f)

### 내가 푼 풀이
👉 [문제풀이](https://github.com/subbangE/codingTest-study/blob/master/src/day_31/bfs.java)

### 접근 방법 및 풀이 해석
```
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();    // 파이프의 총 개수
        int b = s.nextInt();    // 파이프 연결 관계(분기점)의 수

        List<List<Integer>> list = new ArrayList<>(); // 각 파이트와 연결된 파이프들을 저장하기 위한 2차원 리스트 선언

        // 해당 파이프들과 연결된 파이프의 목록 저장
        for (int i = 0; i < a + 1; i++) {   // 파이트 노드는 1부터 시작함으로 0이 생성 되지 않게 하기 위해 a + 1을 해줌
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < b; i++) {
            int e = s.nextInt();    // 분기점
            int b1 = s.nextInt();   // 분기점의 번호
            int b2 = s.nextInt();   // e와 연결된 두 개의 파이프 번호 입력

            // e와 연결된 파이프 b1, b2를 list에 추가
            list.get(e).add(b1);
            list.get(e).add(b2);

            // b1, b2에도 e를 연결된 파이프로 추가
            list.get(b1).add(e);
            list.get(b2).add(e);
        }

        // 각 파이프가 node로부터 얼마나 떨어져 있는지를 저장하는 거리 배열 선언
        int[] d = new int[a + 1];
        Arrays.fill(d, -1); // 모든 노드를 아직 방문하지 않은 노드로 표시(-1)
        d[1] = 1;   // 노드의 거리는 1로 설정

        // BFS 탐색을 위한 큐를 생성
        Queue<Integer> q = new LinkedList<>();
        q.add(1);   // 시작점을 큐에 추가

        // 큐가 비어있을 때까지 반복
        while (!q.isEmpty()) {
            int node = q.poll();    // 현재 방문 중인 노드
            int currentD = d[node]; // 현재 노드의 거리

        // 방문되지 않은 노드는 현재 노드의 거리에서 1을 더한 값으로 재선언하고, 큐에 추가
            for (int n : list.get(node)) {
                if (d[n] == -1) {
                    d[n] = currentD + 1;
                    q.add(n);
                }
            }
        }

        // 1부터 a까지의 거리 출력
        for (int i = 1; i <= a; i++) {
            System.out.println(d[i]);
        }

        // Scanner 및 프로그램 종료
        s.close();
    }
```

### 느낀점
요번에도 문제도 이해가 안되고 푸는 것도 너무 어려워서 챗지피티의 도움을 받아 해석하는 쪽으로 문제를 풀었다🤣
