class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int k:nums){
            if(map.containsKey(k)){
                map.put(k,map.get(k)+1);
            }else{
                map.put(k,1);
            }
        }
        int ans[]=new int[2];
        int i=0;
        for(int k:map.keySet()){
            if(map.get(k)==1){
                ans[i]=k;
                i++;
            }
        }
        return ans;
    }
}