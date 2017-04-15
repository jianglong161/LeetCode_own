/**
 * Created by Still2Almost on 2017/4/15.
 * 1左叶子节点强调首先是叶子子点，同时又得是左节点，才加入运算
 * 2.采用递归
 * 3.如果二叉树为空返回0
 * 4.如果二叉树的左子树为左叶子节点（左子树没有左右子节点），
 * 返回左子点的val值+sumOfLeftLeaves（右子树）的值
    5.如果二叉树的左、右子树都存在孩子结点，
 则返回sumOfLeftLeaves（左子树）+sumOfLeftLeaves（右子树）的值 */
public class SumOfLeftLeaves  {
    public int solution(TreeNode root){
        if(root == null)
            return 0;
        if (root.left!=null && root.left.left==null && root.left.right==null)
            return root.left.val + solution(root.right);
        else {
            return solution(root.left)+solution(root.right);
        }

    }
}
