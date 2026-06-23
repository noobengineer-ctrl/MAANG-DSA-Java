import java.util.*;

class Solution {

    public List<List<Integer>> subsets(int[] nums) {


        List<List<Integer>> result = new ArrayList<>();

        List<Integer> current = new ArrayList<>();


        backtrack(nums, 0, current, result);


        return result;

    }



    private void backtrack(
        int[] nums,
        int index,
        List<Integer> current,
        List<List<Integer>> result
    ) {


        // Add current subset
        result.add(new ArrayList<>(current));



        // Explore choices
        for(int i = index; i < nums.length; i++) {


            // Choose
            current.add(nums[i]);


            // Explore
            backtrack(nums, i + 1, current, result);


            // Undo choice (Backtrack)
            current.remove(current.size() - 1);

        }

    }
}