/**
 * this is the Adaptee class that holds the function we want ,
 * however, we can not directly call.
 */

/**
 * @author Sean inspired by <<Designing Patterns>> Part_I:Chapter_II:Adapter.
 *
 */
public class Banner {
	
	private String string;
	
	public Banner(String string) 
	{
		this.string = string;
	}

	public void showWithParen()
	{
		System.out.println("(" + string + ")");
	}
	
	public void showWithAster() 
	{
		System.out.println("*" + string + "*");
	}
	
	
}
