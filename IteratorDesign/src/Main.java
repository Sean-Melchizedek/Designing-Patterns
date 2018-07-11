/**
 * 
 */

/**
 * @author Sean inspired by <<Designing Patterns>> Part_I:Chapter_I:Iterator.
 *
 */
public class Main {

	public static void main(String[] args) 
	{
		BookShelf bookShelf = new BookShelf(2);
		
		bookShelf.appendBook(new Book("FLOW"));
		bookShelf.appendBook(new Book("Bible"));
		bookShelf.appendBook(new Book("Introdution to Data Structures"));
		
		Iterator itr = bookShelf.iterator();
		while(itr.hasNext())
		{
			Book currentBook = (Book) itr.next();
			System.out.println(currentBook.getName());
		}

	}

}
