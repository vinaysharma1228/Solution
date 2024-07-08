package Questions;

public class QN21 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);
        if (result != null) {
            System.out.println("Indices of the two numbers that add up to " + target + ": " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two numbers add up to the target sum.");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        // Iterate through each element in the array
        for (int i = 0; i < nums.length; i++) {
            // Check every other element after current element
            for (int j = i + 1; j < nums.length; j++) {
                // If the pair of elements equals target, return their indices
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        // If no such pair found, return null
        return null;
    }
}

// efficient way to solve above problem

/*
 

import java.util.HashMap;
import java.util.Map;

public class TwoSumEfficient {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);
        if (result != null) {
            System.out.println("Indices of the two numbers that add up to " + target + ": " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two numbers add up to the target sum.");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        // Map to store (element, index) pairs
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate through each element in the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement needed to reach the target sum
            int complement = target - nums[i];
            
            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                // Return the indices of the current element and its complement
                return new int[] { map.get(complement), i };
            }
            
            // Add the current element and its index to the map
            map.put(nums[i], i);
        }
        
        // If no such pair found, return null
        return null;
    }
}
 
 

 */