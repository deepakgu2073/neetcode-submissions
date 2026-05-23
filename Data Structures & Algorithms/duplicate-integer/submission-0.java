class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hst = new HashSet<>();
        for(int i: nums){
            if(hst.contains(i)) return true;
            else hst.add(i);
        }
        return false;
    }
}