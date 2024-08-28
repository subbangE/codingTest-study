# 99클럽 스터디 38일차 TIL + 키워드 탐욕법(Greedy)
> 2024-08-28 수요일

해시태그: #99클럽 #코딩테스트준비 #개발자취업 #항해99 #TIL

### 문제
![38일차 문제](https://github.com/user-attachments/assets/f3c97512-b478-4539-9051-5b088e99576d)

### 내가 푼 풀이
👉 [문제풀이](https://github.com/subbangE/codingTest-study/blob/master/src/day_38/greedy4.java)

### 접근 방법 및 풀이 해석
```
import java.util.*;

public int greedy4(String s) {
    Map<Character, Integer> map = new HashMap<>();
    int cnt = 0; // 문자열
    boolean check = false;  // 홀수가 있는지 없는지 확인용

    // HashMap에 데이터 삽입
    for (int i=0; i<s.length(); i++) {
        map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
    }

    // 맵의 키만큼 반복
    for (char c : map.keySet()) {
        // 짝수라면
        if (map.get(c) % 2 == 0) {
            cnt += map.get(c);
        } else {    // 홀수라면
            check = true;
            cnt += map.get(c) - 1;
        }
    }

    // 홀수가 있었다면 + 1
    if (check) {
        return cnt + 1;
    }

    // 없다면 그냥 출력
    return cnt;
}
```

### 느낀점
오랜만에 해시맵을 통해서 문제를 풀어봤는데 어떻게 쓰는지 좀 헷갈렸다,, 다른 사람들의 문제 풀이에 보니까 hashset 으로 다들 푸시던데 한번 찾아봐야겠다 !!
