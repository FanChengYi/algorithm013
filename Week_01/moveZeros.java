class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        int a;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                a = nums[j];
                nums[j] = nums[i];
                nums[i] = a;
                j++;
            }
            
        }
    }
}
