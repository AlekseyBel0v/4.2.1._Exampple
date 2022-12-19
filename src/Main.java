import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List newList1 = list.stream().filter(x -> (x > 0 && x % 2 == 0))
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(newList1);
        List<Integer> newList2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 0 && (list.get(i) % 2 == 0)) {
                newList2.add(list.get(i));
            }
            newList2.sort(Comparator.naturalOrder());
        }
        System.out.println(newList2);
    }
}