class Solution {
    public int[] leftRightDifference(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < n; i++) {
            rightSum = rightSum + nums[i];
        }

        for (int i = 0; i < n; i++) {

            rightSum = rightSum - nums[i];

            ans[i] = Math.abs(leftSum - rightSum);

            leftSum = leftSum + nums[i];
        }

        return ans;
    }
}