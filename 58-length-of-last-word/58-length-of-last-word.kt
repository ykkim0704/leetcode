class Solution {
    fun lengthOfLastWord(s: String): Int {
      val wordList = s.split(' ').filter {
            it.isNotBlank()
        }

        return wordList.lastOrNull()?.length ?: 0  
    }
}