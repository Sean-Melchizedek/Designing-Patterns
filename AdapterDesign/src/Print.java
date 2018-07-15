/**
 * this is the target interface in this class based adapter design pattern.
 * This provide the function name that will called in Main(client class).
 */

/**
 * @author Sean inspired by <<Designing Patterns>> Part_I:Chapter_II:Adapter.
 */
public interface Print {
	
	public abstract void printWeak();
	
	public abstract void printStrong();
	
}
