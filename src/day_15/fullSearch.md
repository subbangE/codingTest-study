# 99클럽 스터디 15일차 TIL + 키워드 완전탐색
> 2024-08-05 월요일

해시태그: #99클럽 #코딩테스트준비 #개발자취업 #항해99 #TIL

### 문제
![15일차 문제-1](https://github.com/user-attachments/assets/60331239-f11e-438e-9b28-6ffb846adb90)


### 오늘의 공부 포인트
+ 배열 선언하고 값을 넣음과 동시에 return 할 수 있다!
  > 예시) return new int[]{1,2}

### 내가 푼 풀이
👉 [문제풀이](https://github.com/subbangE/codingTest-study/blob/master/src/day_15/fullSearch.java)

### 접근 방법 및 풀이 해석
1. 수포자1, 2, 3이 번호 반복적으로 찍기 때문에 반복되는 부분만 따와서 int 배열로 선언해줌
2. answers 와 얼마나 맞는지 확인해줘야 함으로 cnt1, 2, 3을 선언해서 맞을때마다 1씩 증가시켜줌
3. 반복문을 끝낸 후 cnt1, 2, 3을 서로서로 비교해서 제일 큰 값을 answer 에 넣어 반환시킴

### 느낀점
문제를 풀면서 진짜 비효율적이게 풀고 있다고 생각이 들어서 풀자마자 다른사람풀이를 봤는데 보완할 점이 눈에 보였다.

1. for 문에서 first, second, third 의 인덱스에 % 를 해줄때 숫자를 넣기 보다 length 를 쓰는게 더 나아보인다.
2. 세개를 각자 따로 비교하는 것보다 세개를 서로 한번 비교한 다음에 max 값을 정해 max 와 비교하는게 코드 길이가 더 짧고 가독성이 있어 보인다.

위의 2가지를 보완해서 풀었다면 좀 더 나았을것 같다.
