# 99클럽 스터디 28일차 TIL + 키워드 큐
> 2024-08-18 일요일

해시태그: #99클럽 #코딩테스트준비 #개발자취업 #항해99 #TIL

### 문제
![28일차 문제](https://github.com/user-attachments/assets/a9b035ee-ad81-46d5-9fc2-065bf0dbec72)
![28일차 문제-2](https://github.com/user-attachments/assets/63249be3-8c6d-46b4-af17-e468b7c05b4b)

### 내가 푼 풀이
👉 [문제풀이](https://github.com/subbangE/codingTest-study/blob/master/src/day_28/queue.java)

### 접근 방법 및 풀이 해석
1. 내림차순으로 정렬해줄 우선순위 큐와 priorities 배열이 그대로 들어갈 큐를 선언해줌
2. for 문을 통해 pq와 q(우선순위 큐와 큐)에 값을 넣어줌
3. pq가 비어있지않을 동안 실행해줄 while 문 안에서 우선 순위 프로세스인지 확인함
4. pq는 비어있지않고 3번의 조건이 성립되지 않을때 answer 값을 증가 시켜 몇번째 실행인지 카운트 시키고 만약에 주어진 index 값에 있는 프로세스가 실행시 리턴 시킴
5. 아니라면 다음 프로세스 값 빼고 index 값을 순서를 다르게 하지 않도록 범위 밖의 정수를 q 에 추가 우선순위에 있는 값을 빼서 다음 값으로 이동시킨 후 카운트 증가
6. pq가 비어있다면 answer 리턴

### 느낀점
스택과 큐에 대한 활용이 아직 부족한 것 같아서 좀 더 많은 문제를 접해봐야겠다
