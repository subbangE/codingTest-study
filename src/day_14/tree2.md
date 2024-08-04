# 99클럽 스터디 14일차 TIL + 키워드 Tree
> 2024-08-04 일요일

해시태그: #99클럽 #코딩테스트준비 #개발자취업 #항해99 #TIL

### 문제
![14일차-1](https://github.com/user-attachments/assets/65e883b6-6eb5-4e6b-999c-a4484c307bae)
![14일차-2](https://github.com/user-attachments/assets/76b4afd1-8987-4c74-a1ef-532154d3d72d)


### 내가 푼 풀이
👉 [문제풀이](https://github.com/subbangE/codingTest-study/blob/master/src/day_14/tree2.java)

### 접근 방법 및 풀이 해석
1. root 의 left 와 right 값을 가져와 만약 null 일 경우에는 값을 가져오지 못하기 때문에 조건문을 통해 예외처리 함
2. left 와 right 가 같다면 left 의 left 값을 큐 sLeft 에 값을 추가하고 right 의 right 값을 큐 sRight 에 값을 추가, left 의 right 와 right 의 left 도 동일
3. 위의 내용을 반복적으로 검사 과정을 걸쳐 다 만족할 경우에는 true 를 리턴하고 중간 중간 만족하지 않을 경우 false 를 리턴

### 느낀점
솔직히 혼자서 제대로 못풀어서 도움을 많이 받았다.. 다른 사람들의 풀이를 보니까 정말 간단하게 재귀함수로도 풀수 있다는걸 알고 뭔가 허무함이 느껴지기도 했다 ㅜㅜ
