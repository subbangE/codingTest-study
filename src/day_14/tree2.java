// 항해99 코딩테스트 스터디 3기 - 14일차
// Symmetric Tree(대칭 트리)

public class tree2 {
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
        public boolean isSymmetric(TreeNode root) {
            TreeNode left;
            TreeNode right;
            Queue<TreeNode> sLeft = new LinkedList<>();
            Queue<TreeNode> sRight = new LinkedList<>();

            sLeft.add(root.left);
            sRight.add(root.right);

            while(!sLeft.isEmpty()) {
                left = sLeft.poll();
                right = sRight.poll();

                if (left == null || right == null) {
                    if (left == null && right == null) {
                        continue;
                    }
                    return false;
                }

                if (left.val == right.val) {
                    if (left.left != null || right.right != null) {
                        if (left.left != null && right.right != null) {
                            sLeft.add(left.left);
                            sRight.add(right.right);
                        } else {
                            return false;
                        }
                    }

                    if (left.right != null || right.left != null) {
                        if (left.right != null && right.left != null) {
                            sLeft.add(left.right);
                            sRight.add(right.left);
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }

            }

            return true;
        }
    }
}