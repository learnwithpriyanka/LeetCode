class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        int strow=0;
        int stcol=0;
        int endrow=n-1;
        int endcol=m-1;
        while(strow<=endrow&&stcol<=endcol){
            for(int i=stcol;i<=endcol;i++){
                ans.add(matrix[strow][i]);
            }
            for(int i=strow+1;i<=endrow;i++){
                ans.add(matrix[i][endcol]);
            }
            for(int i=endcol-1;i>=stcol;i--){
                if(strow==endrow){
                    break;
                }
                ans.add(matrix[endrow][i]);
            }
            for(int i=endrow-1;i>=strow+1;i--){
                if(stcol==endcol){
                    break;
                }
                ans.add(matrix[i][stcol]);
            }
            strow++;stcol++;endrow--;endcol--;
        }
        return ans;
    }
}