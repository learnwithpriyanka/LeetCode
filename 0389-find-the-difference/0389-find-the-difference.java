class Solution {
    public char findTheDifference(String s, String t) {
        char []a=s.toCharArray();
        char[]b=t.toCharArray();
        char c[]=new char[a.length+b.length];
        int i=0;
        for(char ch:a){
            c[i++]=ch;
        }
        for(char ch:b){
            c[i++]=ch;
        }
        char ans='0'-'0';
        for(char k:c){
            ans^=k;
        }
        return ans;
    }
}