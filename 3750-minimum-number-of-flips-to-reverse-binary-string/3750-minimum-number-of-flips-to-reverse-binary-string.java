class Solution {
    public int minimumFlips(int n) {

        String s = Integer.toBinaryString(n);
        int left = 0;
        int right = s.length() - 1;
        int count = 0;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                count++;
            }

            left++;
            right--;
        }

        return count * 2;
    }
}