# 99클럽 스터디 22일차 TIL + 키워드 동적 계획법
> 2024-08-12 월요일

해시태그: #99클럽 #코딩테스트준비 #개발자취업 #항해99 #TIL

### 문제

### 내가 푼 풀이
👉 [문제풀이](https://github.com/subbangE/codingTest-study/blob/master/src/day_22/dp2.java)

### 접근 방법 및 풀이 해석
1. 21일차 문제와 비슷해서 해당 코드를 수정해서 풀어봄
   ```
       public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    list.add(answer.get(i - 1).get(j - 1) + answer.get(i - 1).get(j));
                }
            }

            answer.add(list);
        }

        return answer;
    }
   ```
   여기서 보면 21일차에는 numRows 가 1부터 시작하는데 22일차 문제에서는 rowIndex 가 0부터 시작하여 첫번째 for 문에 i <= rowIndex 로 바꿔줌
2. rowIndex 값에 일치하는 List<Integer> 를 출력 해야하기 때문에 return answer 대신 return answer.get(rowIndex) 로 리턴 해줌

### 느낀점
어제 문제를 토대로 풀어서 좀 더 빨리 풀게 된 것 같다!!
