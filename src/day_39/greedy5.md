# 99클럽 스터디 39일차 TIL + 키워드 탐욕법(Greedy)
> 2024-08-29 목요일

해시태그: #99클럽 #코딩테스트준비 #개발자취업 #항해99 #TIL

### 문제
![39일차 문제](https://github.com/user-attachments/assets/e673a750-3c95-4a26-9431-f1dc06d636b1)

### 내가 푼 풀이
👉 [문제풀이](https://github.com/subbangE/codingTest-study/blob/master/src/day_39/greedy5.java)

### 접근 방법 및 풀이 해석
1. g와 s 배열을 오름차순으로 정렬한 후, while 문을 통해 g와 s의 길이가 벗어나지 않을 때까지 반복 시켜줌
2. 조건문을 통해 g[i]가 s[j]보다 작거나 같으면 answer, i, j를 증가 시켜주고 아니라면 j값을 증가시켜줌
3. else 문을 통해 g[i]와 s의 다음 인덱스 값을 비교할 수 있게 함

### 느낀점
탐욕법은 그냥 하나하나 넣어보거나 비교시켜주기만 하면 돼서 쉽게 풀 수 있는 것 같다!
