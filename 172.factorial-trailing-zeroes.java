// 计算n！的值的末尾有几个0
class Solution {
    public int trailingZeroes(int n) {
        // 注意：不能直接乘，会overflow的
        // 末尾有几个0 取悦于在乘了多少个10，也就是说乘了多少个2和5
        // 1*2*3*4*5*6*7*8*9*10*11.....能看出来每2个数就会出现一个2，每5个数才出现一次5，所以5的次数决定了最终的结果
        // 5..10..15..20..25..30..35 40 45 50  
        // 1   1   1   1   2   1  1   1  1  2   5出现的次数
        // 25会多提供一个5   125会比25再多提供一个5,
        // 答案应该是 n/5+ n/25+n/125...
        return n==0?0:n/5 + trailingZeroes(n/5);
    }
}
