class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var maxLength = 0
        val stringBuilder = StringBuilder()
        
        for(c in s) {
            if(c in stringBuilder) {
                stringBuilder.delete(0, stringBuilder.indexOf(c) + 1)
            }
            
            stringBuilder.append(c)
            if(stringBuilder.length > maxLength) {
                maxLength =  stringBuilder.length
            }
        }
        
        return maxLength
    }
}