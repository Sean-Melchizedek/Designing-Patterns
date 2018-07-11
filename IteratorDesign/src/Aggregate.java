/**
 * This is a interface that conceptually creates Iterator(also is an interface)
 * 
 * looks like this: (Aggregate)  >__defines__> (Iterator).
 * 						/\							/\
 * 						||							||
 * 				{Concrete Aggregate}			{Concrete Iterator}				
 * 						
 * Thus, when we want to use an Iterator, we could call method "iterator" which create an actual iterator.
 * 
 * 
 * ### WHY WE DOING THIS ###
 * To avoid strong coupling.
 * As we conceptually separate Iteration from detailed class implements(Instead of using a single for loop in a Concrete Aggregate),
 * Whenever you change the detailed code in Concrete Aggregate(such like switch array to ArrayList .etc),
 * The changing part will not effect the functionality of Iterator. 
 *  
 * 
 */

/**
 * @author Sean inspired by <<Designing Patterns>> Part_I:Chapter_I:Iterator.
 *
 */
public interface Aggregate {
	
	public abstract Iterator iterator();
	
}
