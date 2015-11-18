import java.util.NoSuchElementException;

import java.util.Iterator;

public class LinkedListIterator<E> implements Iterator<E>
{
	private LinkedList<E> linkedList;
	
	private int current;
	
	public LinkedListIterator(LinkedList<E> l)
	{
		linkedList = l;
		current = 0;
	}
	
	public boolean hasNext()
	{
		return (current < linkedList.size());
	}
	
	public E next()
	{
		if (!hasNext())
			throw new NoSuchElementException();
		current += 1;
		return linkedList.get(current - 1);		
	}
}

