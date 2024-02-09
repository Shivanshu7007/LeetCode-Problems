class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        Arrays.sort(nums);
        int[] hash = new int[nums.length];
        int maxi = -1;
        int lastIndex = 0;
        for(int index=0;index<nums.length;index++){
            hash[index] = index;
            for(int col=0;col<index;col++){
                
                if(nums[index]%nums[col]==0 && 1 + dp[col] > dp[index]){
                    dp[index] = 1 + dp[col];
                    hash[index] = col;
                }
            }
            if(dp[index]>maxi){
                maxi = dp[index];
                lastIndex = index;
            }
        } 
        List<Integer> lst = new ArrayList<Integer>();
        lst.add(nums[lastIndex]);
        while(hash[lastIndex]!=lastIndex){
            lastIndex = hash[lastIndex];
            lst.add(nums[lastIndex]);
            

        }
        return lst;
    }
    
}