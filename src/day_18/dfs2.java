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

public class dfs2 {

    // 항해99 코딩테스트 스터디 3기 - 18일차
    // Increasing Order Search Tree(증가하는 주문 검색 트리)

    public TreeNode increasingBST(TreeNode root) {
        TreeNode answer;
        TreeNode point;
        Queue<TreeNode> q = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();  // 값을 담을 stack 선언
        TreeNode current = root;    // 현재 노드 위치 담을 트리노드 선언

        while (current != null || !stack.isEmpty()) {

            // 트리의 왼쪽이 있는지 없는지 확인하고 stack에 담음
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            // stack 에 없애면서 current에 선언하고 list에 추가
            current = stack.pop();
            q.add(current);

            // 현재 노드의 오른쪽 확인하기 위해
            current = current.right;
        }

        answer = q.poll();
        point = answer;

        while (!q.isEmpty()) {
            point.left = null;
            point.right = q.poll();
            point = point.right;
        }

        point.left = null;

        return answer;

    }
}