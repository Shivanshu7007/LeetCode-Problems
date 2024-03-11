class Solution {
    public String customSortString(String order, String s) {
        Character[] result = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            result[i] = s.charAt(i);
        }

        Comparator<Character> customComparator = (a, b) -> {
            int indexA = order.indexOf(a);
            int indexB = order.indexOf(b);
            return Integer.compare(indexA, indexB);
        };

        Arrays.sort(result, customComparator);

        StringBuilder sb = new StringBuilder();
        for (Character character : result) {
            sb.append(character);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();


        String order1 = "cba";
        String s1 = "abcd";
        System.out.println(solution.customSortString(order1, s1)); 


        String order2 = "bcafg";
        String s2 = "abcd";
        System.out.println(solution.customSortString(order2, s2)); 
    }
}