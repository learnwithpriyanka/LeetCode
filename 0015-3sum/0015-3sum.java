class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        // List<List<Integer>> ans=new ArrayList<>();
        Set<List<Integer>> set=new HashSet<>();
        for(int i=0;i<n;i++){
            HashSet<Integer> seen=new HashSet<>();
            for(int j=i+1;j<n;j++){
                int third=-(nums[i]+nums[j]);
                    if(seen.contains(third)){
                        List<Integer> triplets=Arrays.asList(nums[i],nums[j],third);
                        Collections.sort(triplets);
                        set.add(triplets);
                        
                    }
                
                seen.add(nums[j]);
            }
        }
        return new ArrayList<>(set);
    }
}