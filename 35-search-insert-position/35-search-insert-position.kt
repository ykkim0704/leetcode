class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1
        
        while(left < right) {
            val mid = (left + right) / 2
            when {
                nums[mid] == target -> return mid
                nums[mid] > target -> right = mid -1
                else -> left = mid + 1
            }
        }

        return if(nums[left] < target) left + 1  else left
    }
}