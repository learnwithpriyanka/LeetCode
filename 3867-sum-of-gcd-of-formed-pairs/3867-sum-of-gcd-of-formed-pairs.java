class Solution {
    int gcd(int a,int b){
        if(b%a==0){
            return a;
        }
        return gcd(b%a,a);
    }
    public long gcdSum(int[] nums) {
        int prefixGCD[]=new int[nums.length];
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            prefixGCD[i]=gcd(nums[i],max);
        }
        Arrays.sort(prefixGCD);
        int i=0;
        int j=nums.length-1;
        long sum=0;
        while(i<j){
            long pair=gcd(prefixGCD[i],prefixGCD[j]);
            sum+=pair;
            i++;j--;

        }
        return sum;
    }
}