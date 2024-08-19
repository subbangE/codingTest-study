# 99클럽 스터디 29일차 TIL + 키워드 이분탐색
> 2024-08-19 월요일

해시태그: #99클럽 #코딩테스트준비 #개발자취업 #항해99 #TIL

### 문제
![29일차 문제](https://github.com/user-attachments/assets/cd2090aa-81ed-48fc-ace8-4b77f84e179c)

### 내가 푼 풀이
👉 [문제풀이](https://github.com/subbangE/codingTest-study/blob/master/src/day_29/search.java)

### 접근 방법 및 풀이 해석
1. nums 우선 정렬시킨 후, nums 길이보다 한개 더 추가해서 arr 배열에 값을 순서대로 넣고 비교해서 풀어봄
2. nums 정렬 및 arr 배열을 선언해주고 for 문을 이용해 arr 에 nums 길이의 + 1 만큼 순서대로 숫자를 넣어줌
3. for 문을 이용해서 nums 와 arr 을 비교하여 같지 않으면 리턴시킴

### 느낀점
처음에는 큐를 이용해서 풀려고 했지만 정렬이 생각나 두 배열을 정렬시켜 같지 않는 숫자가 나올때 리턴시키는 방식으로 풀었다! 항상 생각하는건 간단하게 생각이 들지만 코드로 풀어보면 하나도 안간단한 것 같다,,