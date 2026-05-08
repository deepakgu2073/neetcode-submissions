class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;
        int count = 0,i = 0, j = nums.length-1;
        for(int x = 0;x<nums.length; x++){
            if(nums[x] != val) count++;
        }
        if(count == nums.length) return count;
        while(i<j){
            while(nums[i] != val && i<j) i++;
            while(nums[j] == val && i<j) j--;
            nums[i] += nums[j];
            nums[j] = nums[i] - nums[j];
            nums[i] -= nums[j];
        }
        return count;

    }
}