package leetcoed;

public class MedianofTwoSortedArrays {
    /**
     * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
     * <p>
     * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
     * <p>
     * 你可以假设 nums1 和 nums2 不会同时为空。
     * <p>
     * 示例 1:
     * <p>
     * nums1 = [1, 3]
     * nums2 = [2]
     * <p>
     * 则中位数是 2.0
     * <p>
     * 示例 2:
     * <p>
     * nums1 = [1, 2]
     * nums2 = [3, 4]
     * <p>
     * 则中位数是 (2 + 3)/2 = 2.5
     *
     * @param num1
     * @param num2
     * @return
     */
    /*public double medianofTwoSortedArrays(int[] num1, int[] num2) {
        if (num2.length < num1.length) {
            return medianofTwoSortedArrays(num2, num1);
        }

        int len = num1.length + num2.length;
        int cut1 = 0;
        int cut2 = 0;
        int cutL = 0;
        int cutR = num1.length;

        while (cut1 <= num1.length) {
            cut1 = (cutR - cutL) / 2 + cutL;
            double L1 = (cut1 == 0) ? Integer.MIN_VALUE : num1[cut1 - 1];
            double L2 = (cut2 == 0) ? Integer.MIN_VALUE : num2[cut2 - 1];
            double R1 = (cut1 == 0) ? Integer.MAX_VALUE : num1[cut1];
            double R2 = (cut2 == 0) ? Integer.MIN_VALUE : num1[cut2];

            if (L1 > R2) {
                cutR = cut1 -1;
            } else if (L2 > R1) {
                cutL = cut1 + 1;
            } else {
                if (len % 2 == 0) {
                    L1 = L1 > L2 ? L1 : L2;
                    R1 = R1 < R2 ? R1 : R2;
                    return (L1 + R1) / 2;
                } else {
                    R1 = R1 < R2 ? R1 : R2;
                    return R1;
                }
            }
        }
    }*/
}
