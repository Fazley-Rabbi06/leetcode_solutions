class Solution {
    public String frequencySort(String s) {
        StringBuilder res = new StringBuilder();
        //sort in des order and map the char with frq
        Map<Character, Integer> freqMap = new HashMap<>();

        for (Character key : s.toCharArray())
            freqMap.put(key, freqMap.getOrDefault(key, 0) + 1);
        //sort the map in des order
        freqMap = freqMap.entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));

        for (Map.Entry<Character, Integer> eachData : freqMap.entrySet()) {
            for (int i = 0; i < eachData.getValue(); i++) {
                res.append(eachData.getKey());
            }
        }
        return res.toString();
    }
}