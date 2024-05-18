class Solution {
    public List<String> commonChars(String[] words) {
        List<String> resultList = new ArrayList<>();
        List<Map<String, Integer>> wordFreq = new ArrayList<>();
        for (String word : words) {
            Map<String, Integer> freq = new HashMap<>();
            for (int i = 0; i < word.length(); i++) {
                String data = word.charAt(i) + "";
                freq.put(data, freq.getOrDefault(data, 0) + 1);
            }
            wordFreq.add(freq);
        }
        Map<String, Integer> firstFreqMap = wordFreq.get(0);
        for (Map.Entry<String, Integer> map : firstFreqMap.entrySet()) {
            int value = map.getValue();
            boolean flag = true;
            for (int i = 1; i < wordFreq.size(); i++) {
                if (!wordFreq.get(i).containsKey(map.getKey())) {
                    flag = false;
                    break;
                } else {
                    value = Math.min(value, wordFreq.get(i).get(map.getKey()));
                }
            }
            if (flag)
                updateResult(resultList, map.getKey(), value);
        }
        return resultList;
    }
    private static void updateResult(List<String> resultList, String key, int value) {
        for (int i = 0; i < value; i++) {
            resultList.add(key);
        }
    }
}  