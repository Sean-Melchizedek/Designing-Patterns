/**
 * 
 */

/**
 * @author green
 *
 */
public class BookShelfIterator implements Iterator {
	
	private BookShelf bookShelf;
	private int index;
	
	public BookShelfIterator(BookShelf bookShelf) 
	{
		this.bookShelf = bookShelf;
		this.index = 0;
	}
	

	@Override
	public boolean hasNext() 
	{
		if(index < bookShelf.getSize())
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	
	@Override
	public Object next() 
	{
		Book currentBook = bookShelf.getBookAt(index);
		index++;
		return currentBook;
	}

}
