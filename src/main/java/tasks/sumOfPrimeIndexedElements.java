package tasks;
//https://www.codewars.com/kata/59f38b033640ce9fc700015b
public class sumOfPrimeIndexedElements {
    public static void main(String[] args) {
                System.out.println(solve(new int [] {}));
        System.out.println(solve(new int [] {1,2,3,4}));
        System.out.println(solve(new int [] {1,2,3,4,5,6}));
        System.out.println(solve(new int [] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}));
    }

    public static boolean isSimpleInteger(int value) {

        if(value == 0 || value == 1) return false;
        boolean result = true;

        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                result = false;
                break;
            }
        }

        return result;
    }

    public static int solve(int[] arr) {
        int count = 0;
        int to = arr.length;
        for (int i = 0; i < to; i++) {
            if (isSimpleInteger(i) && i >= 2) {
                count += arr[i];
            }
        }

        return count;
    }
}
