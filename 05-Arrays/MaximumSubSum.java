
public class MaximumSubSum {
    public static void main(String[] args) {
        int numArray[] = { 3, -4, 5, 4, -1, 7, -8 };
        System.out.println(MaximumSubSum.maxSubArray(numArray));
    }

    public static int maxSubArray(int[] nums) {
        // Start with the smallest possible number so any sum will be larger
        int maxSum = Integer.MIN_VALUE;

        // Define the length of the array to fix the 'cannot find symbol n' error
        int n = nums.length;

        // Loop 1: Pick the starting point of the subarray (st)
        for (int st = 0; st < n; st++) {
            int currSum = 0; // Reset current sum for the new starting point

            // Loop 2: Pick the ending point (end) and expand the subarray
            for (int end = st; end < n; end++) {
                currSum += nums[end]; // Add the new element to the current sum

                // If this new sum is the biggest we've seen, remember it
                maxSum = Math.max(maxSum, currSum);
            }
        }

        return maxSum;
    }
}
