# 99클럽 스터디 24일차 TIL + 키워드 그래프
> 2024-08-14 수요일

해시태그: #99클럽 #코딩테스트준비 #개발자취업 #항해99 #TIL

### 문제
![23일차 문제](https://github.com/user-attachments/assets/9516f271-0892-4930-a04b-dab17809f393)

### 내가 푼 풀이
👉 [문제풀이](https://github.com/subbangE/codingTest-study/blob/master/src/day_24/graph.java)

### 접근 방법 및 풀이 해석
1. 제일 처음 edges[0] 을 기준으로 edges[0][0] 이나 edges[0][1] 이 다음 노드들과 비교했을때 일치하는 값을 찾으면 되겠다고 생각하고 풀었음
2. for 문을 돌려 edges 의 길이 만큼 돌리고 (edges[?] 부분) for 문을 돌려 edges[0] 의 길이는 무조건 2이지만 edges[0][0]이 다음의 edges[1][0] 값과 같지 않을 수 도있음으로 3보다 작은만큼 돌려주었다
3. 만약 j가 3이 된다면 둘다 일치 하지 않으니까 edges[0][1] 이 중심 노드가 될 수 밖에 없고, 만약 edges[0][0]과 값이 같다면 계속 검증 할 수 있도록 continue 시켜 준었다.
4. 이중 for 문이 모두다 끝났다면 edges[0][0]이 중심 노드이므로 return 해주었다.

### 느낀점
이중 for 문 말고도
```
public int findCenter(int[][] edges) {
         if(edges[0][0]==edges[1][0]||edges[0][0]==edges[1][1])
            return edges[0][0];
        else
            return edges[0][1];
    }
```
이렇게 다들 풀었고 제일 시간 복잡도가 제일 빨랐다.. 나는 [1, 2] 다음에 [2, 1]도 올 수 있을거라 생각해서 이렇게 풀었는데 문제를 잘못이해하고 푼 것같다 그치만 풀었으니까 만-족!
