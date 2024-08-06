# 99클럽 스터디 16일차 TIL + 키워드 완전탐색
> 2024-08-06 화요일

해시태그: #99클럽 #코딩테스트준비 #개발자취업 #항해99 #TIL

### 문제


### 내가 푼 풀이
👉 [문제풀이](https://github.com/subbangE/codingTest-study/blob/master/src/day_16/fullSearch2.java)

### 접근 방법 및 풀이 해석
1. 배열 안에 있는 모든 값 중 가장 큰 값을 구하고, 이차원 배열안에 있는 값 중 작은 값을 뽑아 배열에 넣은 후 거기서 제일 큰 값을 구해야겠다고 생각함
2. minMax, max 를 int 형 변수로 선언, min 을 int 형 배열로 선언함
3. 먼저 for 문을 이용해서 max 값을 구해줌
4. for 문을 이용해서 각각의 이차원 배열에서 작은 값을 min 배열에 넣어줌
5. for 문을 이용해서 min 배열에서 가장 큰 값을 구한 후 min 과 max 를 곱해 리턴함

### 보완하면 좋을 것 같은 부분
+ Math.max() 와 Math.min()을 사용해서 풀기
+ 다른 사람 풀이
    ```
    public int solution(int[][] sizes) {
        int length = 0, height = 0;
        for (int[] card : sizes) {
            length = Math.max(length, Math.max(card[0], card[1]));
            height = Math.max(height, Math.min(card[0], card[1]));
        }
        int answer = length * height;
        return answer;
    }
    ```
+ 시간 복잡도 개선을 위해 for 문 사용 줄여서 풀기

### 느낀점
내가 너무 문제를 꼬와서 생각하나..?😭