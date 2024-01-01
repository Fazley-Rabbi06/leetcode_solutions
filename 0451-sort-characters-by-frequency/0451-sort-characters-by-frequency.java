class Solution {
    public String frequencySort(String s) {
        StringBuilder res = new StringBuilder();
        //sort in des order and map the char with frq
        Map<Character, Integer> freqMap = new HashMap<>();

        for (Character key : s.toCharArray())
            freqMap.put(key, freqMap.getOrDefault(key, 0) + 1);
        //sort the map in des order
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> freqMap.get(b) - freqMap.get(a));
        maxHeap.addAll(freqMap.keySet());

      while (!maxHeap.isEmpty()){
          Character eachChar = maxHeap.remove();
            for (int i = 0; i < freqMap.get(eachChar); i++) {
                res.append(eachChar);
            }
        }
        return res.toString();
    }
}