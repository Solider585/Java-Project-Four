import  java.io.Serializable;

public class Pair <K, V> implements Serializable, Cloneable {
    private final static long serialVersionUID = 1;

    public Pair(K k, V v) {
	this.key = k;
	this.value = v;
    }

    // used by clone()
    private Pair() {
    }

    public K k() { return key; }
    
    public V v() { return value; }


    public boolean equals(Object otherObject) {
	if (this == otherObject) return true; 
	if (otherObject == null) return false; 
	if (getClass() != otherObject.getClass()) return false; 

	// use unbounded wildcard for K and V below to get rid of 
	//      "warning: [unchecked] unchecked cast"
	Pair <?,?> other = (Pair <?,?>)otherObject;
	return k().equals(other.k()) && v().equals(other.v());
    }


    public int hashCode() {
	return 13 * k().hashCode() + v().hashCode();
    }

    public String toString() {
	return k().toString() + ":" + v().toString();
    }

    // returns a shallow clone, as we can call k().clone() and v.clone().
    public Object clone() {
	// cannot rely on K and V types to be cloneable (call k().clone()), since clone() is protected in Object.
	//   so we can't make a deep copy...
	Pair <K,V> copy = new Pair <K,V>(k(), v()); 

	return copy;
	
	// another option would be to return super.clone:
	// try {
	//   return super.clone();
	// } catch (Exception x) { return null; }
    }
    
    
    private K key;
    private V value;
};

