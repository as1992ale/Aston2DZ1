import java.util.HashMap;
import java.util.Map;

public final class Immutable {
    private final int id;
    private final String name;
    private final Map<Integer, String> map;

    public Immutable(int id, String name, Map<Integer, String> map){
        this.id = id;
        this.name = name;
        this.map = copyMap(map);
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public Map<Integer, String> getMap(){
        return copyMap(map);
    }

    private Map<Integer, String> copyMap(Map<Integer, String> original) {
        return new HashMap<>(original);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Immutable{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", map=").append(map);
        sb.append('}');
        return sb.toString();
    }
}