class Solution {
    public int numberOfBeams(String[] bank) {

        List<Integer> list = new ArrayList<>();
        for (String s : bank) {
            int i = 0;
            for (char c : s.toCharArray()) 
                i += (c - '0');
            if (i != 0) 
                list.add(i);
        }

        int ans = 0;
        for (int i = 1; i < list.size(); i++) 
            ans += list.get(i - 1) * list.get(i);
            
        return ans;
    }
}