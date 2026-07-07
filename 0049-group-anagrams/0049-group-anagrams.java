class Solution {
    boolean anagram(String s1,String s2){
         if(s1.length()!=s2.length()){
            return false;
         }

         char[]a=s1.toCharArray();
         char[]b=s2.toCharArray();
         Arrays.sort(a);
         Arrays.sort(b);

         return Arrays.equals(a,b);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
         List<List<String>>ans=new ArrayList<>();
         
         for(int i=0;i<strs.length;i++){
            boolean found=false;
            for(List<String> eachGroup:ans){
                if(anagram(strs[i],eachGroup.get(0))){
                    eachGroup.add(strs[i]);
                    found=true;
                    break;
                }
            }
            if(!found){
                List<String> list=new ArrayList<>();
                list.add(strs[i]);
                ans.add(list);
            }

         }
         return ans;

    }
}