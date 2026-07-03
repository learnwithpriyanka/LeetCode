class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int k:nums){
            if(map.containsKey(k)){
                map.put(k,map.get(k)+1);
            }else{
                map.put(k,1);
            }
        }
        for(int k:map.keySet()){
            if(map.get(k)==1){
                return k;
            }
        }
        return -1;
    }
}