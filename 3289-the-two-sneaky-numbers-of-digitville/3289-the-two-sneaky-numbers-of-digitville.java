class Solution {
    public int[] getSneakyNumbers(int[] nums) {

        int[] count = new int[101];
        int[] ans = new int[2];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;

            if (count[nums[i]] == 2) {
                ans[index] = nums[i];
                index++;
            }
        }

        return ans;
    }
}