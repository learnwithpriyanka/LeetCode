class Solution {
    public int[][] generateMatrix(int n) {
        int ans[][]=new int[n][n];
         int strow=0,stcol=0,endrow=n-1,endcol=n-1;
         int val=1;
        while(strow<=endrow&&stcol<=endcol){
        for(int i=stcol;i<=endcol;i++){
            ans[strow][i]=val;
            val++;
        }
        for(int i=strow+1;i<=endrow;i++){
            ans[i][endcol]=val;
            val++;
        }
        for(int i=endcol-1;i>=stcol;i--){
            if(strow==endrow){
                break;
            }
            ans[endrow][i]=val;
            val++;
        }
        for(int i=endrow-1;i>=strow+1;i--){
            if(stcol==endcol){
                break;
            }
            ans[i][stcol]=val;
            val++;
        }
        strow++;stcol++;endrow--;endcol--;
    }
    return ans;
    }
}