# 99클럽 스터디 17일차 TIL + 키워드 깊이우선탐색(DFS)
> 2024-08-08 목요일

해시태그: #99클럽 #코딩테스트준비 #개발자취업 #항해99 #TIL

### 문제

### 내가 푼 풀이
👉 [문제풀이](https://github.com/subbangE/codingTest-study/blob/master/src/day_18/dfs2.java)

### 접근 방법 및 풀이 해석
1. 어제 이용했던 코드에서 반환하는 값은 리스트 -> 트리노드로 바꼈고 해당 트리노드를 재배치 시켜주는 것이여서 어제 했던 코드에 추가하는 방식으로 풀어야겠다고 생각함
2. 우선 선입선출 방식인 큐를 선언해서 어제 사용했던 list 대신 큐에 add() 를 이용하여 값들을 넣음
3. 큐에 들어 있는 값들을 우선 TreeNode answer 에 해당 값의 노드로 위치 시켜 준 다음 TreeNode point 로 재배치 시켜줌
4. while 문으로 q 가 비어있지 않을 때까지 point.left 에는 null 값을 넣고 point.right 에는 q 의 값을 넣은 후 point 에 point.right 값을 가리키게 해줌
5. while 문이 끝난 후 point.left = null 을 해줌

### 이슈 및 해결 방안
+ 이슈 : answer 을 return 하기 전에 point.left = null; 을 해주지 않아서 오류가 발생함
  + 원인 : point 가 가지고 있던 전의 point.left (즉, point 의 왼쪽 노드) 를 계속 가지고 있어서 발생함

### 느낀점
트리 파트가 진짜 제일 어렵게 느껴진다 언제쯤 익숙해질까,,
