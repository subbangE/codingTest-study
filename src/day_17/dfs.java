import java.util.*;

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

public class dfs {

    // 항해99 코딩테스트 스터디 3기 - 17일차
    // Binary Tree Inorder Traversal(이진 트리 중위 순회)

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>(); // 반환 시킬 list 선언
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
            list.add(current.val);
            
            // 현재 노드의 오른쪽 확인하기 위해
            current = current.right;
        }

        return list;
    }
}