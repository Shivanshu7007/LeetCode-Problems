class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int i=0;
        int[] arr = new int[nums.length+1];
        for(int f: nums){
            arr[f]++;
        }
        for(int curr : arr){
            i = Math.max(i, curr);
        }
        for(int j=0; j<i; j++){
            list.add(new ArrayList<>());
        }
        for(int f : nums){
            for(int j=0; j<i;j++){
                if(!list.get(j).contains(f)){
                    list.get(j).add(f);
                    break;
                }
                
            }
        }
        return list ;
    }
}