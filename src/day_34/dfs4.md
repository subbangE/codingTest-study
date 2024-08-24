# 99클럽 스터디 34일차 TIL + 키워드 DFS(깊이 우선 탐색)
> 2024-08-24 토요일

해시태그: #99클럽 #코딩테스트준비 #개발자취업 #항해99 #TIL

### 문제
![34일차 문제-1](https://github.com/user-attachments/assets/fb835b4b-b3ab-4149-964d-4323a364d83e)
![34일차 문제-2](https://github.com/user-attachments/assets/b2adef93-06f3-4d09-ab0d-ef42d30534dc)

### 내가 푼 풀이
👉 [문제풀이](https://github.com/subbangE/codingTest-study/blob/master/src/day_34/dfs4.java)

### 접근 방법 및 풀이 해석
```
public class dfs4 {
    // h와 w 전역변수
    static int h = 0;
    static int w = 0;

    public static void main(String args[]) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in)); // 입력 받기
        StringTokenizer st = new StringTokenizer(b.readLine()); // 읽어오기
        int fieldCnt = Integer.parseInt(st.nextToken()); // 총 반복수 확인
        String fieldLine = ""; // st 저장

        //총 반복 수
        for (int i = 0; i < fieldCnt; i++) {

            st = new StringTokenizer(b.readLine()); // 다음줄

            List<List<Boolean>> arr = new ArrayList<>(); // 지도
            h = Integer.parseInt(st.nextToken()); // 높이
            w = Integer.parseInt(st.nextToken()); // 넓이
            int cnt = 0; // 양 무리 갯수 확인

            // field 생성
            for (int j = 0; j < h; j++) {
                arr.add(new ArrayList());
                st = new StringTokenizer(b.readLine()); // 다음줄
                fieldLine = st.nextToken();
                for (String a : fieldLine.split("")) {
                    if (a.equals("#")) { // 양이면 true 추가
                        arr.get(j).add(true);
                    } else { // 풀이면 false
                        arr.get(j).add(false);
                    }
                }
            }

            // field 확인
            for (int j = 0; j < h; j++) {
                for (int k = 0; k < w; k++) {
                    if (arr.get(j).get(k) == true) {
                        check(arr, k, j);
                        cnt++;
                    }
                }
            }

            System.out.println(cnt); // 양 무리 갯수 출력
        }
    }

    // 양 무리 확인
    public static void check(List<List<Boolean>> arr, int k, int j) {

        arr.get(j).set(k,false);

        // 가로 + 체크
        if(k+1 < w && arr.get(j).get(k+1).equals(true)) {
            check(arr, k+1, j);
        }

        // 가로 - 체크
        if(k-1 >= 0 && arr.get(j).get(k-1).equals(true)) {
            check(arr, k-1, j);
        }

        // 세로 + 체크
        if(j+1 < h && arr.get(j+1).get(k).equals(true)) {
            check(arr, k, j+1);
        }

        // 세로 - 체크
        if(j-1 >= 0 && arr.get(j-1).get(k).equals(true)) {
            check(arr, k, j-1);
        }

    }
}

```

### 느낀점
오늘 문제는 깊이 우선 방식에 대해 너무 이해도 안되고 푸는거에 어려움을 느껴 페어 프로그래밍을 통해 해결해보았다. 같이 푸니까 훨씬 이해도 잘되고 서로 놓친 부분을 채워나가는 것 같아 종종 이렇게 풀 것같다😊 요즘에 너무 어려워서 gpt 이용해서 풀었는데 오늘은 둘이 힘을 합쳐서 인터넷의 도움 없이 풀어서 뿌듯했다!!
