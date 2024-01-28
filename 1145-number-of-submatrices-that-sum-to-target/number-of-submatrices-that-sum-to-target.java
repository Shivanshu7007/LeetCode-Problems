class Solution {
    public int numSubmatrixSumTarget(int[][] nums, int t) {
        int row=nums.length;
        int col=nums[0].length;
        int count=0;
        for(int i=0;i<row;i++)//1
        {
            int arr[]=new int[col];
            for(int j=i;j<row;j++)//2
            {
                for(int k=0;k<col;k++)//3
                {
                    arr[k]+=nums[j][k];
                }
                for(int l=0;l<col;l++)//4
                {
                    int sum=0;
                    for(int r=l;r<col;r++)//5
                    {
                        sum+=arr[r];
                        if(sum==t)
                        {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}