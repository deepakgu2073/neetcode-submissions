class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer,Integer> hsmp = new HashMap<>();
        for(int i = 0;i<nums.length; i++){
            if(hsmp.containsKey(target-nums[i])) return new int[] {hsmp.get(target-nums[i]),i};
            if(!hsmp.containsKey(nums[i])) hsmp.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }
}
