/**
 * 给定一个二进制数组， 计算其中最大连续1的个数。
 *
 * 示例 1:
 *
 * 输入: [1,1,0,1,1,1]
 * 输出: 3
 * 解释: 开头的两位和最后的三位都是连续1，所以最大连续1的个数是 3.
 * 注意：
 *
 * 输入的数组只包含 0 和1。
 * 输入数组的长度是正整数，且不超过 10,000。
 * @author:xzj
 * @date: 2018/8/1 17:34
 */
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int len = 0;
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num == 1) {
                len++;
                if (i == nums.length - 1) {
                    if (len > max) {
                        max = len;
                        len = 0;
                    }
                }
            } else {
                if (len > max) {
                    max = len;
                }
                len = 0;
            }
        }
        return max;
    }
}
