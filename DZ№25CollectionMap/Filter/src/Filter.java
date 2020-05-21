
import java.util.Map;


public class Filter {

    public boolean isUnique(Map<String, String> map) {


        for (Map.Entry<String, String> m : map.entrySet()) {

            for (Map.Entry<String, String> m1 : map.entrySet()) {

                if (!(m.getKey().equals(m1.getKey())) && (m.getValue().equals(m1.getValue()))) {
                    return false;
                }
            }

        }


        return true;
    }
}
