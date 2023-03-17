import java.util.ArrayList;
import java.util.List;

public class NumberRepository {
    private List<Number> data = new ArrayList<>();
    private static NumberRepository instance = new NumberRepository();

    public static NumberRepository getInstance() {
        return instance;
    }

    //implement addAll() method
    public <T extends Number> void addAll(List<T> data) {
        for (T d : data)
            this.data.add(d);
    }

    public String toString(){
        return data.toString();
    }
}