class Solution {
    private val mapBrackets = mapOf(
        ')' to '(',
        '}' to '{',
        ']' to '['
    )
    
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()

        s.forEach {
            if(mapBrackets.containsValue(it)) {
                stack.push(it)
            } else if(mapBrackets.containsKey(it)) {
                if(stack.isNotEmpty() && mapBrackets[it] == stack.peek()) {
                    stack.pop()
                } else {
                    return false
                }
            }
        }

        return stack.isEmpty()
    }
}