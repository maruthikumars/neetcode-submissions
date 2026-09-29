class Solution {
    public int[] twoSum(int[] nums, int target) {
        //1. Brute Force
        // int[] result = new int[2];
        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j< nums.length; j++){
        //         if(nums[i] + nums[j] == target){
        //            result[i] = i;
        //            result[i+1] = j;
        //         }
        //     }
        // }
        // return result;

    //     for(int i=0; i<nums.length; i++){
    //         for(int j=i+1; j<nums.length; j++){
    //             if(nums[i] + nums[j] == target){
    //                 return new int[]{i, j};
    //             }
    //         }
    //     }
    //     return new int[0];
    // }

    //Hash Map (One Pass)

    HashMap<Integer, Integer> prevMap = new HashMap<>();
    for(int i=0; i< nums.length; i++){
        int num = nums[i];
        int diff = target - num;
        if(prevMap.containsKey(diff)){
            return new int[]{ prevMap.get(diff), i};
        }
        prevMap.put(num, i);
    }
    return new int[]{};
    }
}
