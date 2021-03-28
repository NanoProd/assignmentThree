package DataTypes;

public class DefaultComparator<K> implements Comparable<K> {
    @SuppressWarnings("unchecked")
	public int compare(K a, K b) throws ClassCastException{
        return ((Comparable<K>) a).compareTo(b);
    }

	@Override
	public int compareTo(K o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
