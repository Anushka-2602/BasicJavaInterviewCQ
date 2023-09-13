class Solution {
    private int[] nums;
    public void sortColors(int[] nums) {
        // one pass
        this.nums = nums;
        int low = -1;
        int high = nums.length;
        int mid = 0;
        
        while(mid < high) {
            if (nums[mid] == 1) {
                mid++;
            } else if (nums[mid] == 0) {
                ++low;
                swap(mid,low);
                // skip one, must be 1 bcz you already go through it
                mid++;
            } else {
                high--;
                swap(mid,high);
            }
        }
    }
    
    private void swap(int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
