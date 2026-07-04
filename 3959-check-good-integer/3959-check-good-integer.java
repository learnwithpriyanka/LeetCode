class Solution {
    public boolean checkGoodInteger(int n) {
        int sum=0;
        int s=0;
        while(n>0){
            int ld=n%10;
            sum+=ld;
            s+=ld*ld;
            n/=10;
        }
        return s-sum>=50;
    }
}