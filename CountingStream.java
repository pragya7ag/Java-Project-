
import java.util.*;
import java.util.stream.Collectors;
import java.util.Arrays;

public class CountingStream {
    public static void main(String[] args) {
        Map<Integer, Long> result =
        Arrays.stream(new int[]{1,2,2,3,3,3})
              .boxed()
              .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        System.out.println(result);
    }
}
