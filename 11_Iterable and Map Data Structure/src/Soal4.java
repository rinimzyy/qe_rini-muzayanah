import java.util.*;
class Soal4 {
    public static void main (String[] argv) {

        int[] array1 = new int[] {3,8};
        int[] array2 = new int[] {2,8};
        boolean unique = false;

        List<Integer> results = new ArrayList<>();
        for(int i=0; i<array1.length; i++) {
            for(int j=0; j<array2.length; j++) {
                if(array1[i]==array2[j]) {
                    unique = true;
                    break;
                }
            }
            if(!unique) {
                results.add(array1[i]);
            }
            else {
                unique = false;
            }
        }
        System.out.println(results);
    }}