import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "good");
        Immutable immutable = new Immutable(1, "First", map);
        System.out.println("Immutable before: " + immutable);
        map.put(2, "bad");
        System.out.println("Immutable after: " + immutable);

        Map<Integer, String> retrievedMap = immutable.getMap();
        retrievedMap.put(3, "attempt to modify");
        System.out.println("Immutable after getter modification: " + immutable);
    }
}