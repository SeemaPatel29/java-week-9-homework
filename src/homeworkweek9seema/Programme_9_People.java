package homeworkweek9seema;

import java.util.HashMap;
import java.util.Map;

public class Programme_9_People {
    public static void main(String[] args) {
        Programme_9_People obj = new Programme_9_People();
        obj.person();

    }

    public void person() {
        Map<String , Integer> persons = new HashMap<String, Integer>();
        persons.put("Andy ", 1);
        persons.put("Brian ", 2);
        persons.put("Charlie", 3);
        persons.put("Dan", 4);

        for(Map.Entry<String,Integer> entry : persons.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(value + " = " + key);
        }
    }
}
