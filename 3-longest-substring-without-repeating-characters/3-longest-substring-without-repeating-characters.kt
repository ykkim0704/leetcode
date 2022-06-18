class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var repeatCntMax = 0
        
        for(i in s.indices) {
            val list = mutableListOf(s[i])
            for(j in (i+1) until s.length) {
                if(list.contains(s[j])) {
                    break
                } else {
                    list.add(s[j])
                }
            }

            if(list.size > repeatCntMax) {
                repeatCntMax = list.size
            }
        }

        return repeatCntMax
    }
}