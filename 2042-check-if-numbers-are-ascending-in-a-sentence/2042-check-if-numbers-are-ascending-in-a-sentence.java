class Solution {
    public boolean areNumbersAscending(String s) {
        ArrayList<Integer> ans=new ArrayList<>();
        String[]arr=s.trim().split("\\s+");
        for(int i=0;i<arr.length;i++){
            
            if(arr[i].matches("\\d+")){
                ans.add(Integer.parseInt(arr[i]));
            }
        }
        for(int i=0;i<ans.size()-1;i++){
            if(ans.get(i)>=ans.get(i+1)){
                return false;
            }
        }
        return true;
    }
}