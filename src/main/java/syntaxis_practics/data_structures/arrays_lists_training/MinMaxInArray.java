package syntaxis_practics.data_structures.arrays_lists_training;

import java.util.Arrays;

public class MinMaxInArray {
    public static int[] nums = new int[]{1,2,3,4,99,8,-20,30,45};
    public static void main(String[] args) {

        int min = minNum(nums);
        System.out.println(min);
    }


    public static int minNum(int[] numbers){
        return Arrays.stream(numbers).min().getAsInt();
    }
}
