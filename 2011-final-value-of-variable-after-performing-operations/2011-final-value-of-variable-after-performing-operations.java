class Solution {
    public int finalValueAfterOperations(String[] operations) {
         int X = 0;
        for (int i = 0; i < operations.length; i++) {
            String operation = operations[i];
            if (operation.equals("++X"))
                ++X;
            else if (operation.equals("--X"))
                --X;
            else if (operation.equals("X++")){
                X++;
            }
            else {
                X--;
            }
        }
        return X;
}
}