class Solution {
    public boolean isPathCrossing(String path) {
        int x = 0, y = 0;
        HashSet<String> visited = new HashSet<>();
        visited.add(constructKey(0, 0));
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'N') {
                y++;
            } else if (path.charAt(i) == 'S') {
                y--;
            } else if (path.charAt(i) == 'E') {
                x++;
            } else if (path.charAt(i) == 'W') {
                x--;
            }

            String key = constructKey(x, y);
            System.out.println(key);
            if (visited.contains(key)) {
                return true;
            }
            visited.add(key);
        }

        return false;
    }

    private String constructKey(int x, int y) {
        return x + " " + y;
    }
}