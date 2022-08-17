class Solution {
    public String sortSentence(String s) {
        StringBuilder response = new StringBuilder();
        String[] sentence = s.split(" ");
        String[] result = new String[sentence.length];
        for (int i = 0; i < sentence.length; i++) {
            String element = sentence[i];
            int value = Character.getNumericValue(element.charAt(element.length()-1));
            result[value-1] = element;
        }
        for (String str : result) {
            response.append(str.substring(0,str.length()-1))
                    .append(" ");
        }
        response.delete(response.length()-1,response.length());
        return response.toString();
    }
}