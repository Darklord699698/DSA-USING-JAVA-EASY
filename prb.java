class prb {
    public int[] twoSum(int[] nums, int target) {
        // Iterate over the array to find two numbers that add up to the target
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    // Return the indices of the two numbers
                    return new int[] { i, j };
                }
            }
        }
        // Return an empty array if no solution is found
        return new int[] {};
    }

    public static void main(String[] args) {
        prb solution = new prb();
        int[] nums = {10, 20, 30};
        int target = 50;
        int[] result = solution.twoSum(nums, target);
        if (result.length > 0) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}

