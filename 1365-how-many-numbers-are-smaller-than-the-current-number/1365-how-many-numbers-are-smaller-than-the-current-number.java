class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        int frequency  = 0;
        result[0] = frequency;
        if (2 <= nums.length && nums.length <= 500){
            for (int i = 0; i < nums.length; i++) {
                if (0 <= nums[i] && nums[i]<= 100) {
                    int element = nums[i];
                    for (int j = 0; j < nums.length; j++) {
                        if (element > nums[j] && i!=j){
                            frequency++;
                        }else
                            continue;
                    }
                    result[i] = frequency;
                    frequency = 0;
                }else
                    return result;
            }
        }else
            return result;
        return result;
    }
}