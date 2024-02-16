class Solution {
  public int findLeastNumOfUniqueInts(int[] arr, int k) {
    var map = new HashMap<Integer, Integer>();

    for (var n : arr)
      map.put(n, map.getOrDefault(n, 0) + 1);

    var sortedFreq = new int[map.size()];
    var i = 0;

    for (var freq : map.values())
      sortedFreq[i++] = freq;

    Arrays.sort(sortedFreq);

    for (i=0; i < sortedFreq.length; i++) {
      if (k < sortedFreq[i]) break;
      k -= sortedFreq[i];
    }
    return sortedFreq.length - i;
  }
}