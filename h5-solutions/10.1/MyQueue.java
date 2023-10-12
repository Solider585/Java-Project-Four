package q10_1;

import java.util.Collection;

public interface MyQueue <E> {
	/**
	 * return the top of the queue element or throw NoSuchElementException if empty	  
	 * @return the top of the queue element 
	 * @throws throw NoSuchElementException if empty
	 * @postcondition 
	 */
	E head();

	/**
	 * remove and return the top of the queue element or throw NoSuchElementException if empty	  
	 * @return the top of the queue element 
	 * @throws throw NoSuchElementException if empty
	 * @postcondition head removed from queue && size decremented 
	 */
	E dequeue();

	/**
	 * add an element to the queue
	 * @param e element
	 * @postcondition element added to queue && size incremented 
	 */
	void enqueue(E e);

	/**
	 * returns the size of the queue
	 * @return the size of the queue
	 */
	int size();

	/**
	 * returns true if the queue is empty
	 * @return true if the queue is empty
	 */
	boolean isEmpty();

	/**
	 * add elements to this queue from a collection c of E references
	 * @param c collection
	 */
	void addAll(Collection <? extends E> c);	
}
