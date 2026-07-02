import java.util.*;

class Solution {
    public long minMaxSubarraySum(int[] A, int k) {
        return getContribution(A, k, true) + getContribution(A, k, false);
    }

    private long getContribution(int[] A, int k, boolean findMax) {
        int n = A.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && (findMax ? A[stack.peek()] <= A[i] : A[stack.peek()] >= A[i])) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        stack.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && (findMax ? A[stack.peek()] < A[i] : A[stack.peek()] > A[i])) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        long totalSum = 0;
        for (int i = 0; i < n; i++) {
            long L = i - left[i];
            long R = right[i] - i;

            long maxL = Math.min(L, (long) k);
            long minL = Math.max(1L, k - R + 1);
            long count = 0;

            if (maxL >= minL) {
                long terms = maxL - minL + 1;
                count += (k - minL + 1 + k - maxL + 1) * terms / 2;
                count += (minL - 1) * R;
            } else {
                count += maxL * R;
            }
            totalSum += count * A[i];
        }
        return totalSum;
    }
}