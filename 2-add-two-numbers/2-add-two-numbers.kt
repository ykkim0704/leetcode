/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var listNode: ListNode? = null

        var list1 = l1
        var list2 = l2
        var addNum = 0

        var tempNode: ListNode? = null
        while(list1 != null || list2 != null) {
            val sum = (list1?.`val` ?: 0) + (list2?.`val` ?: 0) + addNum
            addNum = sum / 10

            if(tempNode == null) {
                tempNode = ListNode(sum % 10)
                listNode = tempNode
            } else {
                tempNode.next = ListNode(sum % 10)
                tempNode = tempNode.next
            }
            list1 = list1?.next
            list2 = list2?.next
        }
        
        if(addNum != 0) {
            tempNode?.next = ListNode(addNum) 
        }

        return listNode
    }
}