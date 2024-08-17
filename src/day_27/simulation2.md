# 99클럽 스터디 27일차 TIL + 키워드 시뮬레이션
> 2024-08-17 토요일

해시태그: #99클럽 #코딩테스트준비 #개발자취업 #항해99 #TIL

### 문제

### 내가 푼 풀이
👉 [문제풀이](https://github.com/subbangE/codingTest-study/blob/master/src/day_27/simulation2.java)

### 접근 방법 및 풀이 해석
1. park 의 시작 좌표를 찾아서 answer 에 선언한 다음 하나하나씩 움직여 보며 park 에서 벗어나지 않거나 지나가는 길에 X가 없을 경우에만 움직이도록 문제를 품
2. for 문을 통해 indexOf() 를 사용하여 S 가 포함하는 좌표를 answer 에 선언함
3. num 에 움직일 칸 수를 정수 형태로 변환시켜 switch case 문을 통해 park 에서 벗어나지 않고, E S W N 마다 움직일 칸 수인 num 만큼 이동할때 동안 (for 문사용) 중간에 X 를 만난다면 break 시키고 만나지 않는다면 answer 을 이동 시킴
4. 다 움직였으면 answer 을 반환시킴

### 느낀점
좌표를 통해 구하는 문제들이 시뮬레이션 파트에 포함되는걸까..?