class Solution {
    public int numberOfBeams(String[] bank) {
        int prev=0;
        int res=0;
        for(String x:bank){
            int count=0;
            for(char k:x.toCharArray()){
               
                count+=k-'0';
            }
            if(count>0){
            res+=(count*prev);
            prev=count;  
            }
            
        }
        return res;
    }
}