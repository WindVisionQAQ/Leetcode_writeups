/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */


struct TreeNode* invertTree(struct TreeNode* root){
    if (!root) return NULL;
    if (!root->left&&!root->right) return root;
    else{
        struct TreeNode* temp = (struct TreeNode*)malloc(sizeof(struct TreeNode));
        temp = root->left;
        root->left = root->right;
        root->right = temp;
        root->left = invertTree(root->left);
        root->right = invertTree(root->right);
        return root;
    }
}