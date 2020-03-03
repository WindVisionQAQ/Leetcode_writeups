/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// 将问题递归地化解为合并二叉树的左右子树
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return null;
        else if (t1 == null) return t2;
        else if (t2 == null) return t1;
        else{
            TreeNode t = new TreeNode(t1.val+t2.val);
            t.left = mergeTrees(t1.left, t2.left); // 合并左子树
            t.right = mergeTrees(t1.right, t2.right); // 合并右子树
            return t;
        }
    }
}