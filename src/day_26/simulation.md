# 99클럽 스터디 26일차 TIL + 키워드 시뮬레이션
> 2024-08-16 금요일

해시태그: #99클럽 #코딩테스트준비 #개발자취업 #항해99 #TIL

### 문제
![바탕화면 정리 -1](https://github.com/user-attachments/assets/fc41bd4a-0740-4505-b8be-1243a9268d6f)
![바탕화면 정리 -2](https://github.com/user-attachments/assets/10b68a73-4457-4fce-9eb4-bdc38591ae25)
![바탕화면 정리 -3](https://github.com/user-attachments/assets/4850a239-aacf-43f2-a977-343b5014a28e)

### 내가 푼 풀이
👉 [문제풀이](https://github.com/subbangE/codingTest-study/blob/master/src/day_26/simulation.java)

### 접근 방법 및 풀이 해석
1. 리턴할 정수형 배열 answer 초기화 및 start 와 end 변수 선언을 해줌.
2. for 문을 통해 answer 전체에서 #이 시작하는 인덱스 번호 찾고 제일 처음 나오는 #의 인덱스 번호와, 마지막 인덱스 번호를 start 와 end 에 선언해줌
3. for 문을 통해 answer 전체에서 #이 마지막으로 끝나는 인덱스 번호를 찾은 후 +1을 해줌
4. #의 처음 인덱스 번호와 마지막 인덱스 번호를 찾기 위해 for 문을 이용해 처음 인덱스 번호는 제일 작은 번호를 찾고, 마지막 인덱스 번호는 제일 큰 번호를 찾아 +1을 해줌

### 오늘의 공부 포인트
+ indexOf() : 특정 문자나 문자열이 앞에서부터 처음 발견되는 인덱스를 반환하며 만약 찾지 못했을 경우 "-1"을 반환
+ lastIndexOf() : 특정 문자나 문자열이 뒤에서부터 처음 발견되는 인덱스를 반환하며 만약 찾지 못했을 경우 "-1"을 반환

### 느낀점
indexOf는 기존에 들어봤지만 lastIndexOf는 서치하면서 오늘 처음 알게 되었다 처음에는 문제 길이에 좀 충격을 받았는데 하나하나 읽어보며 이해해서 푸니까 나름 풀만했던 것 같다!
