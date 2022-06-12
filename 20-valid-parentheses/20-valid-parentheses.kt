class Solution {
    fun isValid(s: String): Boolean {
       val stack = mutableListOf<Char>()

        s.forEach {
            when(it) {
                '(','{','['  -> stack.add(it)
                ')' -> {
                    if(stack.lastOrNull() == '(') {
                        stack.removeAt(stack.lastIndex)
                    } else  {
                        return false
                    }
                }
                '}' -> {
                    if(stack.lastOrNull() == '{') {
                        stack.removeAt(stack.lastIndex)
                    } else  {
                        return false
                    }
                }
                ']' -> {
                    if(stack.lastOrNull() == '[') {
                        stack.removeAt(stack.lastIndex)
                    } else  {
                        return false
                    }
                }


            }
        }

        return stack.isEmpty() 
    }
}