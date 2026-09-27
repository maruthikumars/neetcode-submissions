class Solution {
    public boolean hasDuplicate(int[] nums) {//[1, 2, 3, 3]
        Set<Integer> numbers = new HashSet<>();
         for(int i=0; i< nums.length; i++){
            if(!numbers.add(nums[i])){
                return true;
            }
         }
         return false;
    }
}