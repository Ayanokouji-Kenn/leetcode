/**
 * 包含整数的二维矩阵 M 表示一个图片的灰度。你需要设计一个平滑器来让每一个单元的灰度成为平均灰度 (向下舍入) ，平均灰度的计算是周围的8个单元和它本身的值求平均，如果周围的单元格不足八个，则尽可能多的利用它们。
 *
 * 示例 1:
 *
 * 输入:
 * [[1,1,1],
 *  [1,0,1],
 *  [1,1,1]]
 * 输出:
 * [[0, 0, 0],
 *  [0, 0, 0],
 *  [0, 0, 0]]
 * 解释:
 * 对于点 (0,0), (0,2), (2,0), (2,2): 平均(3/4) = 平均(0.75) = 0
 * 对于点 (0,1), (1,0), (1,2), (2,1): 平均(5/6) = 平均(0.83333333) = 0
 * 对于点 (1,1): 平均(8/9) = 平均(0.88888889) = 0
 * 注意:
 *
 * 给定矩阵中的整数范围为 [0, 255]。
 * 矩阵的长和宽的范围均为 [1, 150]。
 * @author:xzj
 * @date: 2018/8/9 15:08
 */
class Solution {
    public int[][] imageSmoother(int[][] M) {
        int[][] result = new int[M.length][M[0].length];
        for(int i = 0; i < M.length; i++) {
            for(int j = 0; j < M[0].length; j++) {
//                到这里，是遍历二维数组的每个位置,对每个点进行灰度计算
//                灰度计算是该点周围8个点的平均值，也就是该点横纵坐标+-1的点
                int count = 0;
                int sum = 0;
                for(int k = -1; k < 2; k++) {
                    for(int l = -1; l < 2; l++) {
                        if (i + k < 0 || i + k >= M.length || j + l < 0 || j + l >= M[0].length) {
                            continue;
                        }
                        count++;
                        sum+=M[i+k][j+l];
                    }
                }
                result[i][j] = sum/count;
            }
        }
        return result;
    }
}
