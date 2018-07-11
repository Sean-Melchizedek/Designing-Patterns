/**
 * This interface defines the functionality of iterators.
 * 
 * Avoiding strong coupling by abstracting detailed classes into interfaces.
 * So by doing this we could reuse this module as much as possible.
 */

/**
 * @author Sean inspired by <<Designing Patterns>> Part_I:Chapter_I:Iterator.
 *
 */
public interface Iterator {
	
	// Can we call next again?
	// if yes then return true, false otherwise.
	public abstract boolean hasNext();
	
	// return current element and advance to next position.(very easy to be confused with)
	public abstract Object next();

}
