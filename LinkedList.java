import java.util.Iterator;

public class LinkedList<E> implements Iterable<E>, Stack<E>, Queue<E>
{
		public ListNode<E> head;
		
		public ListNode<E> tail;
		
		private int size;
		
		public LinkedList()
		{
			head = null;
			tail = null;
			size = 0;
		}
		
		public LinkedList(ListNode<E> h)
		{
			head = h;
			tail = h;
			size++;
		}
		
		public LinkedList(LinkedList<E> other)
		{
			head = new ListNode<E>(other.head.getValue());
			ListNode<E> helper = head;
			for (ListNode<E> curr = other.head.getNext(); curr != null; curr = curr.getNext())
			{
				helper.setNext(new ListNode<E>(curr.getValue()));
				helper = helper.getNext();
				if (curr.getNext() == null)
					tail = helper;
			}
			size = other.size;
		}
		
		public void add(E value)
		{	
			ListNode<E> newListNode = new ListNode<E>(value);
			if (size == 0)
			{
				head = newListNode;
				tail = newListNode;
			}
			else
			{
				tail.setNext(newListNode);
				tail = newListNode;
			}
			size++;
		}
		
		public void push(E value)
		{
			add(0, value);
		}
		
		public void offer(E value)
		{
			add(value);
		}
		
		
		public boolean remove(E value)
		{
			if (indexOf(value) == -1)
				return false;
			remove(indexOf(value));
			return true;
		}
		
		public E remove(int index)
		{
			if (index < 0 || index > size - 1)
				throw new IndexOutOfBoundsException("Index Must be greater than or equal to 0 and less than or equal to " + (size - 1));
			E holder = get(index);
			if (size == 1)
			{
				
				head = null;
				tail = null;
				size--;
			}	
			else if (index == 0)
			{
				head = head.getNext();
				size--;
			}
			else
			{
				ListNode<E> curr = head;
				for (int i = 0; i < index - 1; i++)
					curr = curr.getNext();
				if (index == size - 1)
					tail = curr;
				curr.setNext(curr.getNext().getNext());
				size--;
			}
			return holder;
		}
		
		public void removeFirst()
		{
			remove(0);
		}
		
		public void removeLast()
		{
			remove(size - 1);
		}
		
		public void addFirst(E value)
		{
			add(0, value);
		}
		
		public void addLast(E value)
		{
			add(value);
		}
		
		public boolean contains(E value)
		{
			return (indexOf(value) != -1);
		}
		
		public int size()
		{
			return size;
		}
		
		public void clear()
		{
			head = null;
			tail = null;
			size = 0;
		}
		
		public E get(int index)
		{
			if (index < 0 || index > size - 1)
				throw new IndexOutOfBoundsException("Index Must be greater than or equal to 0 and less than or equal to " + (size - 1));
			ListNode<E> curr = head;
			for (int i = 0; i < index; i++)
			{
				curr = curr.getNext();
			}
			return curr.getValue();
		}
		
		public E set(int index, E value)
		{
			if (index < 0 || index > size - 1)
				throw new IndexOutOfBoundsException("Index Must be greater than or equal to 0 and less than or equal to " + (size - 1));
			E holder = get(index);
			remove(index);
			add(index, value);
			return holder;
		}
		
		public void add(int index, E value)
		{
			if (index < 0 || index > size)
				throw new IndexOutOfBoundsException("Index Must be greater than or equal to 0 and less than or equal to " + size);
			ListNode<E> newListNode = new ListNode<E>(value);
			if (size == 0 || index == size)
				add(value);
			else if (index == 0)
			{
				newListNode.setNext(head);
				head = newListNode;
				size++;
			}
			else
			{
				ListNode<E> curr = head;
				for (int i = 0; i < index - 1; i++)
					curr = curr.getNext();
				newListNode.setNext(curr.getNext());
				curr.setNext(newListNode);
				size++;
			}
		}
		
		public int indexOf(E value)
		{
			int index = 0;
			ListNode<E> curr = head;
			for (index = 0; index < size; index++)
			{
				if (value == null)
				{
					if (curr.getValue() == value)
						return index;
				}
				else if (value.equals(curr.getValue()))
					return index;
				curr = curr.getNext();
			}
			return -1;
			
		}
		
		public E poll()
		{
			return remove(0);
		}
		
		public E pop()
		{
			return remove(0);
		}
		
		public E peek()
		{
			return get(0);
		}
		
		public boolean isEmpty()
		{
			if (size == 0)
				return true;
			return false;
		}
		
		public String toString()
		{
			String output = "";
			int index = 0;
			for (ListNode<E> curr = head; curr != null; curr = curr.getNext())
			{
				output += index + ": " + curr;
				if (curr.getNext() != null)
					output += "\n";
				index++;
			}
			return output;
		}
		
		public Iterator<E> iterator()
		{
			return new LinkedListIterator<E>(this);
		}
	}