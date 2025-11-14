import java.util.HashMap;
import java.util.Map;

public class Immutable {
    private final int id;
    private final String name;
    private final Map<Integer, String> map;

    public Immutable (int id, String name, Map<Integer, String> map){
        this.id = id;
        this.name = name;
        Map<Integer, String> deepCopy = new HashMap<>();
        for (Integer key: map.keySet()){
            deepCopy.put(key, map.get(key));
        }
        this.map = deepCopy;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public Map<Integer, String> getMap(){
        Map<Integer, String> deepCopy = new HashMap<>();
        for (Integer key: map.keySet()){
            deepCopy.put(key, map.get(key));
        }
        return deepCopy;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Immutable{");
        sb.append("id = ").append(id);
        sb.append(",name = '").append(name).append('\'');
        sb.append(",map=").append(map);
        sb.append('}');
        return sb.toString();
    }

}
