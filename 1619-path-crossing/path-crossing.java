class Solution {
    public boolean isPathCrossing(String path) {
        int x=0,y=0;
        HashSet<Pair<Integer,Integer>> hs=new HashSet<>();
        hs.add(new Pair<>(0,0));
        for(int i=0;i<path.length();i++)
        {
            if(path.charAt(i)=='N')
            {
                y++;
            }
            else if(path.charAt(i)=='E')
            {
                x++;
            }
            else if(path.charAt(i)=='W')
            {
                x--;
            }
            else if(path.charAt(i)=='S')
            {
                y--;
            }
            System.out.println(hs);
            if(!hs.contains(new Pair<>(x,y)))
            {
                hs.add(new Pair<>(x,y));
            }
            else
            {
                return true;
            }
        }
        return false;
    }
}