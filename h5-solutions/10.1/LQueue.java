package q10_1;

import java.util.*;

/**
 * Queue class adapter with linked list implementation.
 * @invariant size() >= 0 
 * @author icardei
 *
 * @param <E>
 */
public class LQueue <E> implements MyQueue<E> {
	// adaptee object:
	private LinkedList<E> elements;
	
	public LQueue() {
		elements = new LinkedList<E>(); 
	}
	
	@Override
	public E head() {
		E h = elements.getFirst(); // getFirst throws the expected exception, if empty
		return h;
	}

	@Override
	public E dequeue() {
		return elements.removeFirst(); // throws the expected exception, if empty 
	}

	@Override
	public void enqueue(E e) {
		elements.add(e);   // add FIFO order
	}

	@Override
	public int size() {
		return elements.size();
	}

	@Override
	public boolean isEmpty() {
		return size() == 0;
	}


	@Override
	public void addAll(Collection <? extends E> c) {
	    elements.addAll(c);
	}

}
