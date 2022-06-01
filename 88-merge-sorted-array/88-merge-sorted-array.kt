class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        val copyNum1 = nums1.copyOf()

        var offset = 0
        var offset1 = 0
        var offset2 = 0

        while(offset1 < m || offset2 < n) {
            if(offset1 >= m) {
                nums1[offset++] = nums2[offset2++]
            } else if(offset2 >= n) {
                nums1[offset++] = copyNum1[offset1++]
            } else {
                if(copyNum1[offset1] < nums2[offset2]) {
                    nums1[offset++] = copyNum1[offset1++]
                } else {
                    nums1[offset++] = nums2[offset2++]
                }
            }
        }
        
        
    }
}