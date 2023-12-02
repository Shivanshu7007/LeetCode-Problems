class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] charFrequency = new int[26];
        for (char ch : chars.toCharArray()) {
            charFrequency[ch - 'a']++;
        }

        int totalLength = 0;
        for (String word : words) {
            if (canFormWord(word, charFrequency.clone())) {
                totalLength += word.length();
            }
        }

        return totalLength;
    }

    private boolean canFormWord(String word, int[] charFrequency) {
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (charFrequency[index] == 0) {
                return false;
            }
            charFrequency[index]--;
        }
        return true;
    }
}