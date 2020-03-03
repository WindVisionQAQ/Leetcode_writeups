/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
	int Max = 0;
	public int Depth(TreeNode root)
	{
		if (root==null) return 0;
		else{
			int lh = Depth(root.left);
			int rh = Depth(root.right);
			if(lh+rh>Max) Max = lh+rh;
			return (lh>rh)?(lh+1):(rh+1);
		}
	}
    public int diameterOfBinaryTree(TreeNode root) {
    	int a = Depth(root);
    	return Max;
    }
}