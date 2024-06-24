import java.util.List;

/**
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [3,0,1]
 * Output: 2
 * Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
 * Example 2:
 * <p>
 * Input: nums = [0,1]
 * Output: 2
 * Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
 * Example 3:
 * <p>
 * Input: nums = [9,6,4,2,3,5,7,0,1]
 * Output: 8
 * Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
 */
public class MissingNumber {

    public static void main(String x[]) {
        Solution.run();
    }

    class Solution {
        private static void run() {
            List<Integer> nums = List.of(9, 6, 4, 2, 3, 5, 7, 0, 1);
            int n = nums.size();
            int sumOfAllElements = (n * (n + 1)) / 2;
            int sum = 0;
            for (Integer num : nums) {
                sum = sum + num;
            }

            System.out.println("The missing number is " + (sumOfAllElements - sum));
        }
    }
}
