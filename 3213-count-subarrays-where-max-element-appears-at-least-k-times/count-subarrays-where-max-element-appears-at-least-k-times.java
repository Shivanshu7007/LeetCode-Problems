class Solution {
    public long countSubarrays(int[] n, int k) {
        int[] st = new int[n.length+1]; int si=0;
        int m=0;
        for(int i=0; i<n.length; i++){
            if(m<n[i]){
                m=n[i]; si=0;
            }
            if(m==n[i]){
                st[si++]=i;
            }
        }
        if(si<k)return 0;

        long r = 0;
        st[si]=n.length;
        for(int i=k; i<=si; i++){
            r += (long)(st[i-k]+1) * (st[i]-st[i-1]);
        }
        return r;
    }
}