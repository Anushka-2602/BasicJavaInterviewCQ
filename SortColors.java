// /Instead of just two parts like quick sort, the array will be divided into three pieces using this solution: 0, 1, and 2. Simply put, we place 0 on the left and 2 on the right.
// We have two pointers that show the boundaries of the 0s and 2s (low points to the right boundary of the 0 and high points to the left boundary of the 2).During the partition, 
// one thing is for sure: left side of low pointer will be all 0s and right side of high pointer will be all 2s. This is guranteed by swaping nums[mid] with the number[low + 1] when nums[mid] == 0 and 
// with number[high - 1] when nums[mid] == 2

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
