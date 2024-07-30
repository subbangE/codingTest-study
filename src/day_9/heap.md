# 99클럽 스터디 9일차 TIL + 키워드 Heap
> 2024-07-30 화요일

해시태그: #99클럽 #코딩테스트준비 #개발자취업 #항해99 #TIL

### 문제
+ 문제 설명
    + score크기가 인 정수 배열이 주어지고 n, 여기서 는 경쟁에서 선수 score[i]의 점수입니다 . 모든 점수는 고유함이 보장됩니다. 선수들은 점수에 따라 배치 되는데, 선수가 가장 높은 점수를 받은 자리, 선수가 가장 높은 점수를 받은 자리 등입니다. 각 선수의 배치는 순위를 결정합니다.1st2nd2nd
        + 선수 의 순위는 .입니다 .1st "Gold Medal"
        + 선수 의 순위는 .입니다 .2nd "Silver Medal"
        + 선수 의 순위는 .입니다 .3rd "Bronze Medal"
    + 선수의 자리 가 있는 자리에 대한 순위는 배치 번호입니다(즉, 선수의 자리 순위는 ) 선수 의 순위 를 나타내는 answer크기의 배열을 반환합니다
+ 제한 조건
    + n == score.length
    + 1 <= n <= 104
    + 0 <= score[i] <= 106
    + 모든 값은 고유 score 합니다 .

+ 입출력 예
    + 예시 1:
        + 입력: 점수 = [5,4,3,2,1]
        + 출력: ["금메달", "은메달", "동메달", "4", "5"]
        + 설명: 순위는 [1 위 , 2 위 , 3 위 , 4 위 , 5 위 ]입니다.
    + 예시 2:
        + 입력: 점수 = [10,3,8,9,4]
        + 출력: ["금메달","5","동메달","은메달","4"]
        + 설명: 순위는 [1 위 , 5 위 , 3 위 , 2 위 , 4 위 ]입니다.

### 내가 푼 풀이
👉 [문제풀이](https://github.com/subbangE/codingTest-study/blob/master/src/day_9/heap.java)

### 접근 방법 및 풀이 해석
1. score 와 정렬 시킨 scoreSort 가 필요하다 생각해서 score 의 값을 scoreSort 에 for 문을 이용해서 넣은 후 Arrays.sort 를 이용해 내림차순으로 정렬 시킴
2. map(점수, 순위) 을 선언한 후 for 문과 if 문을 이용해서 해당 점수에 순위를 각각 매핑(put() 이용) 시킴
3. 여기서 else i + 1을 한 이유는 인덱스 번호는 0부터 시작하기 때문에 + 1을 해줘야함
4. for 문을 이용해서 answer 에 score[i] 와 일치하는 map 의 키를 찾아 값을 넣음 (get("?"): ?와 일치하는 키의 값을 반환) answer 리턴

### 이슈 및 해결 방안
```
import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] answer = new String[score.length];
        Integer[] scoreSort = new Integer[score.length];
        int cnt = 0;
        

        for (int i=0; i< score.length; i++) {
            scoreSort[i] = score[i];
        }

        Arrays.sort(scoreSort, Collections.reverseOrder());

        for (int i=0; i<score.length; i++) {
            for (int j=0; j<scoreSort.length; j++) {
                if (score[i] == scoreSort[j] && j == 0) {
                    answer[i] = "Gold Medal";
                    cnt++;
                } else if (score[i] == scoreSort[j] && j == 1) {
                    answer[i] = "Silver Medal";
                    cnt++;
                } else if (score[i] == scoreSort[j] && j == 2) {
                    answer[i] = "Bronze Medal";
                    cnt++;
                } else if (score[i] == scoreSort[j] && j == cnt) {
                    answer[i] = "" + (cnt + 1);
                    cnt++;
                }
            }

        }

        return answer;
    }
}
```

![에러](https://github.com/user-attachments/assets/a9a12ef0-051e-43cd-92e7-fb90ae75e33f)

+ 2번째 테스트에서 자꾸 에러가남
    + int cnt 를 선언해서 사용하는 것 대신에 hashmap 을 이용해서 키 : 점수, 값 : 순위로 하여 매핑시킴
    + for 문을 이용해서 score 배열의 순서대로 scoreSort 키와 비교해서 값을 answer 배열에 넣은 후 return

### 느낀점
어제도 그렇고 오늘도 cnt 에 집착해서 에러가 난게 아닐까라고 추측해본다.. 자꾸 왜 나는 갯수로 문제를 풀려할까😂😂
Heap 에 대해 아는게 없어서 또 공부할게 생겼다 미루지말고 매일매일 공부해보자 할수있따!!!!!!
