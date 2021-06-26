class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        if (nums[0] < nums[n-1]){ // corner case
            return nums[0];
        }
        int start = 0;
        int end = n-1;
        while (start + 1 < end){
            int mid = start + (end-start)/2;
            if (nums[mid] >= nums[n-1]){
                start = mid;
            } else {
                end = mid;
            }
        }
        if (nums[start] < nums[end]){
            return nums[start];
        } else {
            return nums[end];
        }
    }
}