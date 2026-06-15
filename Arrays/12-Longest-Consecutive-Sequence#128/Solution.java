import java.util.HashSet;

class Solution {

    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        // Add all numbers into HashSet
        for(int num : nums){
            set.add(num);
        }


        int longest = 0;


        // Check every number
        for(int num : set){

            // Check starting point
            if(!set.contains(num - 1)){

                int currentNum = num;
                int count = 1;


                // Count consecutive numbers
                while(set.contains(currentNum + 1)){

                    currentNum++;
                    count++;

                }


                longest = Math.max(longest, count);
            }
        }


        return longest;
    }
}