class Solution {
    public int[] twoSum(int[] A, int t) {
        int i=0,j=A.length-1;
        while(i<j){
            int sum =A[i]+A[j];
            if(sum>t) j--;
            else if(sum<t) i++;
            else{
                return new int[]{i+1,j+1};
            }
        }
        return new int[]{-1,-1};

        
    }
}