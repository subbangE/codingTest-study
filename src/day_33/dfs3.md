# 99클럽 스터디 33일차 TIL + 키워드 DFS(깊이 우선 탐색)
> 2024-08-23 금요일

해시태그: #99클럽 #코딩테스트준비 #개발자취업 #항해99 #TIL

### 문제

### 내가 푼 풀이
👉 [문제풀이](https://github.com/subbangE/codingTest-study/blob/master/src/day_33/dfs3.java)

### 접근 방법 및 풀이 해석
```
public class dfs3 {

    // 이 메서드는 주어진 이진 트리의 루트와 거리(distance)를 바탕으로
    // 조건에 맞는 좋은 리프 노드 쌍의 수를 계산합니다.
    public int countPairs(TreeNode root, int distance) {
        int[] result = new int[1];  // 좋은 리프 노드 쌍의 수를 저장할 변수를 선언합니다.
        // DFS 탐색을 시작합니다. 결과는 result 배열에 저장됩니다.
        dfs(root, distance, result);
        return result[0];  // 최종 결과를 반환합니다.
    }

    // 이 메서드는 DFS(깊이 우선 탐색)를 통해 각 노드에서 리프 노드까지의 거리를 계산합니다.
    // 리턴 값은 각 거리에 있는 리프 노드들의 수를 담은 배열입니다.
    private int[] dfs(TreeNode node, int distance, int[] result) {
        if (node == null) {
            return new int[distance + 1];  // 노드가 null이면 거리가 0인 빈 배열을 반환합니다.
        }

        // 리프 노드인 경우, 자신을 나타내는 거리가 1인 배열을 반환합니다.
        if (node.left == null && node.right == null) {
            int[] leafDistances = new int[distance + 1];
            leafDistances[1] = 1;  // 리프 노드는 자기 자신으로부터 거리가 1이므로, 배열의 1번째 인덱스를 1로 설정합니다.
            return leafDistances;  // 리프 노드 배열을 반환합니다.
        }

        // 왼쪽 서브트리에서 리프 노드까지의 거리 배열을 구합니다.
        int[] leftDistances = dfs(node.left, distance, result);
        // 오른쪽 서브트리에서 리프 노드까지의 거리 배열을 구합니다.
        int[] rightDistances = dfs(node.right, distance, result);

        // 좌우 서브트리에서 리프 노드 쌍을 찾아 그 사이의 거리가 distance보다 작은지 확인합니다.
        for (int i = 1; i <= distance; i++) {
            for (int j = 1; j <= distance - i; j++) {
                // 왼쪽과 오른쪽 서브트리에서 오는 리프 노드 쌍 중 거리가 조건을 만족하는 쌍의 수를 계산합니다.
                result[0] += leftDistances[i] * rightDistances[j];
            }
        }

        // 현재 노드에서의 리프 노드까지의 거리를 계산합니다.
        int[] currentDistances = new int[distance + 1];
        // 각 거리에서 왼쪽과 오른쪽 서브트리의 리프 노드 수를 합산합니다.
        for (int i = 2; i <= distance; i++) {
            currentDistances[i] = leftDistances[i - 1] + rightDistances[i - 1];
        }

        // 현재 노드의 거리 배열을 반환하여 부모 노드로 전달합니다.
        return currentDistances;
    }
}

```

### 느낀점
요즘 왤케 문제가 어려운지.. 트리 문제는 봐도봐도 너무 어렵고 재귀함수 해석은 되는데 활용하지는 못하겠다,, ㅜㅜㅜ
