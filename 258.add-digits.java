// 给定一个数 38   3+8=11   1+1=2   返回2
// 也就是求一个数的数字根 具体解释 https://en.wikipedia.org/wiki/Digital_root

class Solution {
    public int addDigits(int num) {
        /*先说结论，一个数的数字根 0是0  9是9 其他数的数字根都是模9
        比如 12345 = 1*（9999+1） + 2*（999+1） + 3*（99+1）+4*（9+1）+5
                   = 1*9999+2*999+3*99+4*99 + 1+2+3+4+5
                   =  1*9999+2*999+3*99+4*99 + 15
                   = 1*9999+2*999+3*99+4*99 + 9+ 6  -> 数字根是6
        可以看出一个数的数字根总是表示他超出9的倍数多少*/
        if(num == 0) return 0;
        int mod = num%9;
        return mod==0?9:mod;
    }
}
