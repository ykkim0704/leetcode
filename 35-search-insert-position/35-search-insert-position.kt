class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        nums.forEachIndexed { index, i ->
            if(i >= target) {
               return index
            }
        }

        return nums.size
    }
}