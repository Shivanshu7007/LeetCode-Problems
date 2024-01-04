import java.util.HashMap;
import java.util.Map;

class Solution {
    public int minOperations(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        int second;
        int result = 0;
        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            second = entry.getValue();
            if (second == 1) {
                return -1;
            }
            if (second % 3 == 1) {
                result += (second / 3) - 1;
                result += 2;
            } else {
                result += (second / 3);
                result += ((second % 3) / 2);
            }
        }
        return result;
    }
}