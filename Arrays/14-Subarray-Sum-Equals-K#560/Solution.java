import java.util.HashMap;

class Solution {

    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Initial prefix sum
        map.put(0, 1);

        int sum = 0;
        int count = 0;


        for(int num : nums) {

            sum += num;


            // Check if required prefix exists
            if(map.containsKey(sum - k)) {

                count += map.get(sum - k);

            }


            // Store current prefix sum frequency
            map.put(
                sum,
                map.getOrDefault(sum, 0) + 1
            );
        }


        return count;
    }
}