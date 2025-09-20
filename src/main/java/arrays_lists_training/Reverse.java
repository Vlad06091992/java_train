package arrays_lists_training;

import java.util.Arrays;

public class Reverse {
//    public static int[] nums = new int[]{1, 2, 3, 4, 99, 8, -20, 30, 45};
//    public static int[] nums = new int[]{1, 2, 3, 4, 99, 8, -20, 30, 45};
    public static int[] nums = new int[]{1, 2, 3,4,5};

//    [45, 30, -20, 8, 99, 3, 3, 2, 1]

    public static void main(String[] args) {



        for (int i = 0; i < nums.length; i++) {
            int rightIndex =  nums.length - i - 1;
            int curr = nums[i];
            nums[i] = nums[rightIndex];
            nums[rightIndex] = curr;
            if( i >= nums.length/2) break;
        }

        System.out.println(Arrays.toString(nums));

    }
}
