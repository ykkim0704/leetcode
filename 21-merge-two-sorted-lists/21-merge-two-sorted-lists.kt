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
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        return if(list1 == null) list2
        else if(list2 == null) list1
        else {
            if(list1.`val` < list2.`val`) {
                list1.apply { 
                    next = mergeTwoLists(list1.next, list2)
                }
            } else {
                list2.apply { 
                    next = mergeTwoLists(list1, list2.next)
                }
            }
        }
    }
}