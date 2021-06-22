fun main() {
    val s = Solution()
    val res = s.permutation("abc")

    println(res.joinToString(","))
}


class Solution {
    val set = mutableSetOf<String>()
    lateinit var charArr:CharArray
    lateinit var boolArr : BooleanArray

    fun permutation(s: String): Array<String> {
        charArr = s.toCharArray()
        boolArr = BooleanArray(charArr.size)
        dfs(0,"")
        return set.toTypedArray()
    }

    /** 把可用的字符串往固定位置填 */
    fun dfs(index:Int,curr:String){
        if (index == charArr.size){
            set.add(curr)
        }
        for (i in charArr.indices){
            if (!boolArr[i]) {
                boolArr[i]=true
                dfs(index+1,curr+charArr[i])
                boolArr[i]=false
            }
        }
    }
}

