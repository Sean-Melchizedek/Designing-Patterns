/**
 * This is the most important part in Adapter design, obviously Adapter.
 * Adapter class is the child class of the adaptee(Banner) and implements the target(Print.interface).
 */

/**
 * @author Sean inspired by <<Designing Patterns>> Part_I:Chapter_II:Adapter.
 *
 */
public class PrintBanner extends Banner implements Print {

	/**
	 * @param string
	 */
	public PrintBanner(String string) 
	{
		super(string);	
	}

	@Override
	public void printWeak() 
	{
		this.showWithParen();
	}

	@Override
	public void printStrong() 
	{
		this.showWithAster();
	}

}
