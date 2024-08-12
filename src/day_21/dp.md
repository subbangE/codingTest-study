# 99클럽 스터디 21일차 TIL + 키워드 동적 계획법
> 2024-08-11 일요일

해시태그: #99클럽 #코딩테스트준비 #개발자취업 #항해99 #TIL

### 문제
![21일차 문제](https://github.com/user-attachments/assets/5d39468b-954e-4e74-b15b-d4b22fec34a8)

### 내가 푼 풀이
👉 [문제풀이](https://github.com/subbangE/codingTest-study/blob/master/src/day_21/dp.java)

### 접근 방법 및 풀이 해석
1. numRows 만큼 for 문을 돌리고 list 를 선언해준 후, j 가 i 보다 크거나 같을 때까지 for 문으로 반복함 (i 는 행이고 j 는 해당 i의 개수 (= 열)를 나타냄)
2. j가 0이거나 i랑 값이 똑같다면 (첫번째와 마지막 숫자는 항상 1) 무조건 1이기 때문에 list 에 add(1) 을 해주고, 아니라면 list 에 이전 행(i-1)의 열 j-1, j의 합을 구하여 현재 list 에 추가
3. j 의 for 문이 끝났다면 answer 에 list 를 추가
4. numsRows 만큼 실행했다면 answer 리턴

### 느낀점
항상 어떻게 문제를 풀어야할지 감은 오는데 마무리가 부족한 것 같다..😥
