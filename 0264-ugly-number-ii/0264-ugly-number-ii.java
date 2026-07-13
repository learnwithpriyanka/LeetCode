class Solution {
    public int nthUglyNumber(int n) {
        int arr[]=new int[n];
        arr[0]=1;
        int i2=0,i3=0,i5=0;
        for(int i=1;i<n;i++){
            int next=Math.min(arr[i2]*2,Math.min(arr[i3]*3,arr[i5]*5));
            arr[i]=next;
            if(next==arr[i2]*2){
                i2++;
            }
            if(next==arr[i3]*3){
                i3++;
            }
            if(next==arr[i5]*5){
                 i5++;
            }
        }
        
        return arr[n-1];
    }
}