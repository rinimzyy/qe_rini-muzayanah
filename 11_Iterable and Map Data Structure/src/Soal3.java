import java.util.*;

class Soal3 {
    public static int[] array(int[] number, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < number.length; i++) {
            int complement = target - number[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            } else {
                numMap.put(number[i], i);
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                array(new int[]{1, 2, 3, 4, 6}, 6)));
    }
}