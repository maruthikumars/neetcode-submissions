class Solution {
    public boolean hasDuplicate(int[] nums) {
        //1. Brute force

            // for(int i=0; i<nums.length; i++){
            //     for(int j= i+1; j<nums.length; j++){
            //         if(nums[i] == nums[j]){
            //             return true;
            //         }
            //     }
            // }
            // return false;

        //2. Sorting
            // Arrays.sort(nums);
            // for(int i=1; i<nums.length; i++){
            //     if(nums[i] == nums[i-1]){
            //         return true;
            //     }
            // }
            // return false;

        //3.Hash Set

            Set<Integer> numbers = new HashSet<>();
             for(int i=0; i< nums.length; i++){
                if(!numbers.add(nums[i])){
                    return true;
                }
             }
             return false;

            //  Set<Integer> seen = new HashSet<>();
            //  for(int num : nums){
            //         if(seen.contains(num)){
            //             return true;
            //         }
            //         seen.add(num);
            //     }
            // return false;

        //4. HashSet Length            
            // return Arrays.stream(nums).distinct().count() < nums.length;
    }
}