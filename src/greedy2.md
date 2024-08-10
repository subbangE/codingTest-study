# 99클럽 스터디 20일차 TIL + 키워드 Greedy
> 2024-08-10 토요일

해시태그: #99클럽 #코딩테스트준비 #개발자취업 #항해99 #TIL

### 문제

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

### 느낀점
화이팅
