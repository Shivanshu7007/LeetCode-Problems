class Solution {
    static int mod =(int) 1e9 +7;
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length + 1;
        int[] left = new int[n];
        int[] ext = new int[n];
        int[] sums = new int[n];
        for(int i = 0; i < n -1; ++i)
           ext[i+1] = arr[i];
           
        int res = 0;
        for (int i = 1; i < n; i++) {
            int cur = ext[i];
            int l = i - 1;
            while (ext[l] >= cur) 
                l = left[l];
            
            left[i] = l;
            sums[i] = sums[l] + cur * (i - l);
            res = (res + sums[i]) % mod;
        }
        return res;        
    }
}