class Solution {
    public int mostWordsFound(String[] sentences) {
        int[] result = new int[sentences.length];
        for (int s = 0; s < sentences.length; s++) {
            String element = sentences[s];
            int length = element.split(" ").length;
            result[s] = length;
            length = 0;
        }
        int max = result[0];
        for (int i = 1; i < result.length; i++) {
            if (max<=result[i])
                max = result[i];
            else
                continue;
        }
        return max;
}        
    }