# 99클럽 스터디 40일차 TIL + 키워드 동적계획법(DP)
> 2024-08-30 금요일

해시태그: #99클럽 #코딩테스트준비 #개발자취업 #항해99 #TIL

### 문제
![40일차 문제](https://github.com/user-attachments/assets/b4650359-4adb-4522-993f-06a6d36d1a5e)

### 내가 푼 풀이
👉 [문제풀이](https://github.com/subbangE/codingTest-study/blob/master/src/day_40/dp3.java)

### 접근 방법 및 풀이 해석

```
public int minCostClimbingStairs(int[] cost) {
int n = cost.length; // n을 cost 배열의 길이로 선언
int[] arr = new int[n]; // 최소 비용을 저장할 배열 선언

        arr[0] = cost[0]; // 첫 번째 비용 초기화
        arr[1] = cost[1]; // 두 번째 비용 초기화

        // 세 번째부터 n보다 작을때 반복
        for (int i = 2; i < n; i++) {
            // 최소 비용 계산, 현재 계단은 바로 인덱스 번호 i - 1 또는 i - 2에서 올 수 있음
            arr[i] = Math.min(arr[i-1] + cost[i], arr[i-2] + cost[i]);
        }

        // 인덱스 번호 i - 1 또는 i - 2에서 끝날 수 있으므로 이 두 경우 중에서 최소 비용을 반환
        return Math.min(arr[n-1], arr[n-2]);
    }
```

### 느낀점
처음에는 재귀 함수로 풀라했지만 재귀함수로 풀기에 뭔가 복잡해 질거 같아서 for 문을 이용해서 풀었다,,
동적계획법은 주로 for 문이나 재귀함수로 문제를 푸는 것 같다 !
