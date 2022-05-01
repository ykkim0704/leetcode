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
        val listNode: ListNode = ListNode(1)

        var list1 = l1
        var list2 = l2
        var addNum = 0

        var tempNode: ListNode = listNode
        while(list1 != null || list2 != null) {
            var sum = (list1?.`val` ?: 0) + (list2?.`val` ?: 0) + addNum
            addNum = 0

            if( sum >= 10) {
                sum = sum.rem(10)
                addNum = 1
            }

            tempNode.next = ListNode(sum)
            tempNode = tempNode.next

            list1 = list1?.next
            list2 = list2?.next
        }

        if(addNum != 0) {
            tempNode?.next = ListNode(addNum)
        }

        return listNode.next
    }
}