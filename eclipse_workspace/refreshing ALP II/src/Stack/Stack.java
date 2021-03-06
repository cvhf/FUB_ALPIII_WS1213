package stack;

public interface Stack <E> {
	
	public boolean empty();
	public void push(E element);
	public E pop() throws EmptyStackException;
	public E peek() throws EmptyStackException;

}
