class Solution {
    public boolean searchMatrix(int[][] m, int t) {
        if (m == null || m.length == 0 || m[0].length == 0) return false;
        int row=m.length;
        int col=m[0].length;
        int left=0;
        int right=row*col-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            int r=mid/col;
            int c=mid%col;
            
            int current=m[r][c];
            if(current==t) return true ;
            else if(current<t) left=mid+1;
            else right=mid-1;
        }
        return false;
        
    }
}