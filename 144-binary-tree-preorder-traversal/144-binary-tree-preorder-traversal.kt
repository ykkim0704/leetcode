/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun preorderTraversal(root: TreeNode?): List<Int> {
        val list = mutableListOf<Int>()
        if(root != null) {
            list.add(root.`val`)
            root.left?.let { 
                list.addAll(preorderTraversal(it))
            }
            
            root.right?.let {
                list.addAll(preorderTraversal(it))
            }
        }
        
        return list
    }
}