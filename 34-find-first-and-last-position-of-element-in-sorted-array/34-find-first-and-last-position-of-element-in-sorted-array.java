class Solution {
    public int[] searchRange(int[] nums, int target) {        int[] result = new int[2];
        int lastIndex = -1;
        boolean flag = true;
        result[0] = -1;
        result[1] = -1;
        if (nums.length > 0) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target && flag) {
                    result[0] = i;
                    flag = false;
                    lastIndex = i;
                }
                else if (nums[i] == target)
                    lastIndex = i;
            }
            result[1] = lastIndex;
        }else
            return result;
        return result;
        
    }
}