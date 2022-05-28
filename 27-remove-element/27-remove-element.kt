class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var cnt = 0
        nums.forEachIndexed { index, num ->
            if(num != `val`) {
                nums[cnt++] = num
            }
        }
        return cnt
    }
}