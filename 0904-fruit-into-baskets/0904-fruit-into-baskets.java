class Solution {
    public int totalFruit(int[] A) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        int i = 0, j = 0;
        int max_len = 0;

        while (j < A.length) {

            hm.put(A[j], hm.getOrDefault(A[j], 0) + 1);

            while (hm.size() > 2) {

                hm.put(A[i], hm.get(A[i]) - 1);

                if (hm.get(A[i]) == 0) {
                    hm.remove(A[i]);
                }

                i++;
            }

            max_len = Math.max(max_len, j - i + 1);
            j++;
        }

        return max_len;
    }
}