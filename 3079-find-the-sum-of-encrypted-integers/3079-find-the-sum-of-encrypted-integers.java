class Solution {

    public int sumOfEncryptedInt(int[] nums) {

        int sum = 0;

        for (int num : nums) {

            int maxDigit = 0;
            int base = 0;
            int temp = num;

            while (temp > 0) {
                maxDigit = Math.max(maxDigit, temp % 10);
                base = base * 10 + 1;
                temp /= 10;
            }

            sum += maxDigit * base;
        }

        return sum;
    }
}