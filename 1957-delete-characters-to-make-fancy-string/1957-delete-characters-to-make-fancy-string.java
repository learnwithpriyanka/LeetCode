class Solution {
    public String makeFancyString(String s) {
        if(s.length()<=2){
            return s;
        }
        StringBuilder sb=new StringBuilder();
        char[]arr=s.toCharArray();
        
        sb.append(arr[0]);
        sb.append(arr[1]);
        for(int i=2;i<arr.length;i++){
            if(arr[i]==arr[i-1]&&arr[i]==arr[i-2]){
                continue;
            }else{
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }
}