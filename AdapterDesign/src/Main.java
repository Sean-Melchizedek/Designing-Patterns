//@author Sean inspired by <<Designing Patterns>> Part_I:Chapter_II:Adapter.

public class Main {

	public static void main(String[] args) 
	{
		Print printer = new PrintBanner("Hello World");
		printer.printStrong();
		printer.printWeak();
	}

}
