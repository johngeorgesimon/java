import java.util.*;
import java.util.stream.*;

// This class is to demonstrate basic stream operations like stream, filter, sorted etc...

public class StreamBasic {

    //filter the elements, basically filter accepts a functional interface predicate it has a test method and the return type is boolean
    private List<Integer> filterMethod(List<Integer> numList){
        return numList.stream()
                .filter(n->n==0)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

    }
}
