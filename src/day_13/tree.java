// 항해99 코딩테스트 스터디 3기 - 13일차
// Search in a Binary Search Tree(이진 탐색 트리에서의 검색)

public class tree {
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
    class Solution {
        public TreeNode searchBST(TreeNode root, int val) {
            while(true) {   // 무한 반복
                if (root.val == val) {  // root의 val과 val이 같다면 root(val, left, right) 출력
                    return root;
                } else if (root.left != null && root.val > val) {   // root의 left가 null이 아니고 val이 root의 val보다 작다면 root의 left로 이동
                    root = root.left;
                } else if (root.right != null && root.val < val) {  // root의 right가 null이 아니고 val이 root의 val보다 크다면 root의 right로 이동
                    root = root.right;
                } else {
                    return null; // val이 없는 경우 null 리턴
                }
            }

        }
    }
}