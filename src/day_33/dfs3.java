/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class dfs3 {

    // 항해99 코딩테스트 스터디 3기 - 33일차
    // Number of Good Leaf Nodes Pairs(좋은 잎 노드 쌍의 수)

    public int countPairs(TreeNode root, int distance) {
        int[] result = new int[1];  // 좋은 리프 노드 쌍의 수를 저장할 변수
        dfs(root, distance, result);
        return result[0];
    }

    // DFS를 수행하여 각 노드에서 리프 노드까지의 거리를 계산
    private int[] dfs(TreeNode node, int distance, int[] result) {
        if (node == null) {
            return new int[distance + 1];  // 빈 배열 반환
        }

        if (node.left == null && node.right == null) {
            int[] leafDistances = new int[distance + 1];
            leafDistances[1] = 1;  // 리프 노드는 자신에서부터 거리가 1인 상태로 설정
            return leafDistances;
        }

        int[] leftDistances = dfs(node.left, distance, result);  // 좌측 서브트리 탐색
        int[] rightDistances = dfs(node.right, distance, result);  // 우측 서브트리 탐색

        // 좌우 서브트리에서 온 리프 노드 쌍 사이의 거리를 계산
        for (int i = 1; i <= distance; i++) {
            for (int j = 1; j <= distance - i; j++) {
                result[0] += leftDistances[i] * rightDistances[j];
            }
        }

        // 현재 노드에서의 거리 계산
        int[] currentDistances = new int[distance + 1];
        for (int i = 2; i <= distance; i++) {
            currentDistances[i] = leftDistances[i - 1] + rightDistances[i - 1];
        }

        return currentDistances;
    }
}