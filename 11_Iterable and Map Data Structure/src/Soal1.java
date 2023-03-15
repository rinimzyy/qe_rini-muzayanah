import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Soal11 {
    public static void main(String[] args) {
        String[] a = new String[]{"kazuya", "jin", "lee"};
        String[] b = new String[]{"kazuya", "feng"};
        String[] c = merge(a, b);
        System.out.println(Arrays.toString(c));
    }

    public static String[] merge(String[] a, String[] b) {
        List<String> strings = Stream.of(a, b).flatMap(Stream::of).collect(Collectors.toList());
        Set<String> nama = new HashSet<String>(strings);

        String[] c = new String[nama.size()];
        nama.toArray(c);
        return c;
    }

}
