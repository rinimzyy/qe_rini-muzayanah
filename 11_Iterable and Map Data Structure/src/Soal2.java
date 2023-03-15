import java.util.*;

public class Soal2 {
    public static void main(String[] args) {
        Map<Integer, Integer> merge = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int [] data = {7,6,5,2,3,7,5,2};
        for (int j : data)
            merge.merge(j, 1, Integer::sum);

        for (Map.Entry<Integer, Integer> intToFrequency : merge.entrySet()) {
            if (intToFrequency.getValue() == 1) {
                list.add(intToFrequency.getKey());
            }
        }
        System.out.println(list);
    }
}
