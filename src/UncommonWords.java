import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UncommonWords {
    public void uncommom(String A, String B) {
        String[] splitA = A.split(" ");
        String[] splitB = B.split(" ");
        Map<String, Integer> A_wor = new HashMap<>();
        Map<String, Integer> B_wor = new HashMap<>();
        List<String> result = new ArrayList<>();
        for (String temp : splitA) {
            A_wor.put(temp, A_wor.getOrDefault(temp, 0) + 1);
        }
        for (String temp : splitB) {
            B_wor.put(temp, A_wor.getOrDefault(temp, 0) + 1);
        }
        for (String temp : A_wor.keySet()) {
            if (A_wor.get(temp) == 1 && !B_wor.containsKey(temp)) {
                result.add(temp);
            }
        }
        for (String temp : B_wor.keySet()) {
            if (A_wor.get(temp) == 1 && !A_wor.containsKey(temp)) {
                result.add(temp);
            }
        }
        String[] res = result.toArray(new String[result.size()]);
    }
}


