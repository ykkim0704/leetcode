class Solution {
    fun strStr(haystack: String, needle: String): Int {
        loop@for(i in haystack.indices) {
            for(j in needle.indices) {
                if(haystack.getOrNull(i+j) != needle[j]) continue@loop
            }
            return i
        }
        return -1
    }
}