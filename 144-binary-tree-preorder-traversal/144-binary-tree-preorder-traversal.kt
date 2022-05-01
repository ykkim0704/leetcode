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
        root?.let { rootNode ->
            list.add(rootNode.`val`)
            rootNode.left?.let {
                list.addAll(preorderTraversal(it))
            }

            rootNode.right?.let {
                list.addAll(preorderTraversal(it))
            }
        }

        return list
    }
}