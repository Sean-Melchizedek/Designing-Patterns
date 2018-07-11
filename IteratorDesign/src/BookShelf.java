import java.util.ArrayList;


/**
 * class implementation for Aggregate
 */

/**
 * @author Sean inspired by <<Designing Patterns>> Part_I:Chapter_I:Iterator.
 *
 */
public class BookShelf implements Aggregate {

	private ArrayList<Book> booklist;

	
	public BookShelf(int startedSize)
	{
		this.booklist = new ArrayList<Book>(startedSize);
	}
	
	public Book getBookAt(int index)
	{
		return booklist.get(index);
	}
	
	public void appendBook(Book book)
	{
		this.booklist.add(book);
	}
	
	public int getSize()
	{
		return this.booklist.size();
	}
	

	@Override
	public Iterator iterator() 
	{
		return new BookShelfIterator(this);
	}

}
