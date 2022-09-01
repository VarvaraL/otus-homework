import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

import java.util.Arrays;

public class HelloOtus {
    public static void main(String[] args) {

        String[] words = {"a", "as", "asd"};
        Multiset<String> counts = HashMultiset.create();
        counts.addAll(Arrays.asList(words));
        System.out.println(counts);

    }
}
