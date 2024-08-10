# 99클럽 스터디 20일차 TIL + 키워드 Greedy
> 2024-08-10 토요일

해시태그: #99클럽 #코딩테스트준비 #개발자취업 #항해99 #TIL

### 문제
점심시간에 도둑이 들어, 일부 학생이 체육복을 도난당했습니다. 다행히 여벌 체육복이 있는 학생이 이들에게 체육복을 빌려주려 합니다. 학생들의 번호는 체격 순으로 매겨져 있어, 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있습니다. 예를 들어, 4번 학생은 3번 학생이나 5번 학생에게만 체육복을 빌려줄 수 있습니다. 체육복이 없으면 수업을 들을 수 없기 때문에 체육복을 적절히 빌려 최대한 많은 학생이 체육수업을 들어야 합니다.
전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost, 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때, 체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.


### 내가 푼 풀이
```
import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int cnt = n - lost.length;
        
        Arrays.sort(reserve);
        Arrays.sort(lost);
        
        
        
    
        for (int i = 0; i < lost.length; i++) {
         for (int j = 0; j < reserve.length; j++) {
            if (lost[i] == reserve[j]) {
                    cnt++;
               lost[i] = -1;
               reserve[j] = -1;
                    break;
            }
         }
      }
        
        
        for (int i = 0; i < lost.length; i++) {
         for (int j = 0; j < reserve.length; j++) {
            if (lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]) {
                    cnt++;
               reserve[j] = -1;
               break;
            }
         }
      }
        answer = cnt;
        return answer;
    }
}
```
        
### 접근 방법 및 풀이 해석
1. n을 lost 배열의 길이만큼 뺀다
2. for문을 이용하여 lost배열과 reserve배열의 관계를 확인 후 n을 추가한다.
3. for문이 정상적으로 종료되면 answer을 반환한다
