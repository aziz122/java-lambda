package fr.codeonce.lambda;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListConcatenator {
    public List<String> concat(List<String> l1, List<Integer> l2) {
        Stream<String> s1 = l1.stream();
        Stream<String> s2 = l2.stream().map(Object::toString);
        List<String> result = Stream.concat(s1, s2)
                                    .collect(Collectors.toList());
        return result;
    }
}
