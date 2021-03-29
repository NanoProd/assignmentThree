package DataTypes;
import java.util.Comparator;

public class DefaultComparator<K extends Comparable<? super K>> implements Comparator<K> {
    public int compare(K a, K b)
    {
        return a.compareTo(b);
    }
}
