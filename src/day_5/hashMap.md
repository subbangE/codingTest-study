# 문자열을 정수로 바꾸기(String)
> 2024-07-26 금요일 5일차

### 문제
+ 문제 설명
    + 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
    + 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

+ 제한 조건
    + 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
    + completion의 길이는 participant의 길이보다 1 작습니다.
    + 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
    + 참가자 중에는 동명이인이 있을 수 있습니다.

+ 입출력 예

  |participant|completion| return   |
  |-----------|----------|----------|
  |["leo", "kiki", "eden"]|["eden", "kiki"]| "leo"    |
  |["marina", "josipa", "nikola", "vinko", "filipa"]|["josipa", "filipa", "marina", "nikola"]| "vinko"  |
  |["mislav", "stanko", "mislav", "ana"]|["stanko", "ana", "mislav"]| "mislav" |

### 오늘의 공부 포인트
+ Map과 HashMap의 차이점
  + Map : 인터페이스이므로 직접 인스턴스를 생성할 수 없음. new HashMap과 같이 구체적인 구현 클래스의 인스턴스를 생성해야함.
    + 선언 방법: Map<키 자료형, 값 자료형> map = new HashMap<키 자료형, 값 자료형>();
  + new HashMap : 코드에서 구체적인 HashMap 인스턴스를 생성하는 방법을 나타내며, 이 인스턴스를 사용하여 데이터를 저장하고 관리.
    + 선언 방법: HashMap<키 자료형, 값 자료형> hashMap = new HashMap<키 자료형, 값 자료형>();
+ 해시맵 관련 메소드
  + put() : 키, 값을 저장 / get : 키, 값을 가져옴

### 내가 푼 풀이
👉 [문제풀이](https://github.com/subbangE/codingTest-study/blob/master/src/day_5/HashMap.java)

### 느낀점
해시맵과 관련된 문제를 한번도 제대로 푼적이 없어서 이때까지 풀었던 문제 중 가장 오래걸리고 구글의 힘으로 푼 것 같아 많이 아쉬웠지만
이번 기회에 해시맵 관련 메소드와 기본적인 구조를 파악하는 계기가 되었다. 해시맵 관련하여 여러 문제를 풀어서 당황하지 않도록 감을 익혀야겠다 화이팅!!
