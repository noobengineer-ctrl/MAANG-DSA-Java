import java.util.*;

class Solution {

    public int[] topKFrequent(int[] nums, int k) {


        // Step 1: Count frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){

            map.put(num, map.getOrDefault(num, 0) + 1);

        }


        // Step 2: Min Heap
        PriorityQueue<int[]> heap =
                new PriorityQueue<>(
                    (a,b) -> a[1] - b[1]
                );


        // Step 3: Add elements into heap
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){


            heap.offer(
                new int[]{
                    entry.getKey(),
                    entry.getValue()
                }
            );


            // Keep only k elements
            if(heap.size() > k){

                heap.poll();

            }
        }


        // Step 4: Create answer
        int[] result = new int[k];


        for(int i = 0; i < k; i++){

            result[i] = heap.poll()[0];

        }


        return result;
    }
}