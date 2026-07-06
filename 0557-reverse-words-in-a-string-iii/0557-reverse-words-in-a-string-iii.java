class Solution {
    String reverse(String s){
        char[]arr=s.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }
        return new String(arr);
    }
    public String reverseWords(String s) {
        String[]a=s.trim().split("\\s+");
        // StringBuilder sb=new StringBuilder();
        for(int i=0;i<a.length;i++){
            a[i]=reverse(a[i]);
        }
        return String.join(" ",a);
    }
}