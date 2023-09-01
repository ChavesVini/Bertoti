import java.util.Arrays;
import java.util.List;

import com.sun.org.apache.xerces.internal.jaxp.validation.*;  ;

public class ForQueryList {
    public static void main(String[] args) {
        List<String> QueryList = Arrays.asList("Chocolate", "Morango", "Uva");
        for (int i = 0; i < QueryList.size(); i++) {
            System.out.println(QueryList.get(i));
        }
    }
}
