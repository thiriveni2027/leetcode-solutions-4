class Solution {
    public int distributeCandies(int[] A) {
        HashSet<Integer> hs=new HashSet<>();
        int n=A.length/2;
        for(int df:A){
            hs.add(df);
        }

            
            int df_size=hs.size();
            int min=Math.min(n,df_size);
            return min;
        
    }
}