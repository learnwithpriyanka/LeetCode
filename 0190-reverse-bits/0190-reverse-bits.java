class Solution {
    public int reverseBits(int n) {
        StringBuilder sb=new StringBuilder(32);
        for(int i=0;i<32;i++){
            int rem=n%2;
            sb.append(rem);
            n/=2;
        }
          System.out.println(sb);
       String rev= sb.toString();
       int power=0;
       int digit=0;
       for(int i=rev.length()-1;i>=0;i--){
               int ld= rev.charAt(i)-'0';
               digit+=ld*(1<<power);
               power++;
       }
       return digit;
    }
}