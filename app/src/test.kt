import kotlin.math.max
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val s = Solution()
    println(2.3.toInt())
    println(2.4.toInt())
    println(2.5.toInt())
}


class Solution {
    fun numSquares(n: Int): Int {
        val dp = IntArray(n+1)
        for (i in 1..n){
            var cnt = Int.MAX_VALUE
            for (j in 1..sqrt(i.toDouble()).toInt()) {
                if (dp[i-j*j]<cnt) cnt=dp[i-j*j] //组成前一个平方数需要几个数字
            }
            dp[i]=cnt+1 //遍历完了，取最小的数字 再加上自己
        }
        return dp[n]
    }
}

