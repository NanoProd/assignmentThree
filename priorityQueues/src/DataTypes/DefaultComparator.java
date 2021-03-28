package DataTypes;

public class DefaultComparator<E> implements Comparable<E> {
    @SuppressWarnings("unchecked")
	public int compare(E a, E b) throws ClassCastException{
        return ((Comparable<E>) a).compareTo(b);
    }

	@Override
	public int compareTo(E o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
