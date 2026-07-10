class Solution {
    void reverse(int[]nums,int i,int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;j--;
        }
    }
    public void nextPermutation(int[] nums) {
        int pivot=-1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                pivot=i-1;
                break;
            }
        }
        if(pivot==-1){
            reverse(nums,0,nums.length-1);
            return;
        }
        int right=-1;
        for(int i=nums.length-1;i>pivot;i--){
            if(nums[i]>nums[pivot]){
                right=i;
                break;
            }
        }
        int temp=nums[pivot];
        nums[pivot]=nums[right];
        nums[right]=temp;
        reverse( nums,pivot+1,nums.length-1);

    }
}