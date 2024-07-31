# 99클럽 스터디 10일차 TIL + 키워드 Heap
> 2024-07-31 수요일

해시태그: #99클럽 #코딩테스트준비 #개발자취업 #항해99 #TIL

### 문제
![문제](https://github.com/user-attachments/assets/c228e15f-47f7-40ef-b2c6-3aaffb787b02)


### 오늘의 공부 포인트
+ 우선순위 큐 (PriorityQueue)
  + 큐는 선입선출, 우선순위 큐는 요소들을 내림차순 or 오름차순으로 자동 정렬시켜줌
  + 선언 방법
    + PriorityQueue<자료형> 큐 변수명 = new PriorityQueue<>() : 오름차순
    + PriorityQueue<자료형> 큐 변수명 = new PriorityQueue<>(Collections.reverseOrder()) : 내림차순
    + Arrays.sort 와 PriorityQueue 동일하게 내림차순은 " Collections.reverseOrder() " 사용
  + poll() 보다 remove()가 더 빠름

### 내가 푼 풀이
👉 [문제풀이](https://github.com/subbangE/codingTest-study/blob/master/src/day_10/heap2.java)

### 접근 방법 및 풀이 해석
1. 처음에는 Arrays.sort() 를 이용하여 문제를 풀려고 했지만, 자꾸 에러가 나 찾아보니 PriorityQueue(우선순위 큐)라는 방식이 있어 시용함
2. 문제에서 KthLargest(int k, int[] nums)에 k와 nums를 초기화시키라고 해서 초기화 시켜줌 => 굳이 nums는 초기화 안시켜도 됨, 대신 우선순위 큐인 min 을 초기화 시켜줌
3. for 문을 통해 add 메서드에 num 즉 nums의 값, 변수 val 을 넣어서 실행시킴
4. add 메소드에서 min.size()(큐의 크기)보다 k가 더 크다면 offer 를 통해 값을 넣어줌 => k값보다 작을때까지 계속해서 큐에 값을 넣음
5. k보다 min 의 크기가 크거나 같고, 정수 val 값이 min,peek()(헤더값 출력, 큐에서 제일 작은 수)보다 크다면 기존의 peek 값을 poll 을 이용해서 요소를 없애고 val 을 큐에 추가함
6. if 문이 끝나면(4, 5번 과정) min.peek() 리턴 => 즉, k 번째로 가장 큰 값

### 느낀점
오늘은 문제 이해하는데에도 엄청 오래 걸리고 문제를 푸는 중에 큐에도 종류가 있다는 것도 처음 알았다..ㅜㅜ 그래도 하나씩 차근차근 알게되는 것 같아서 한달 후에는 실력이 지금보다 늘겠지!?!? 뽜이링
