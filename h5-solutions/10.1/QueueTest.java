package q10_1;

import java.util.*;


public class QueueTest {

	private static void log(String msg) {
		System.out.println(msg);
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LQueue <Integer> q = new LQueue <Integer>();
		
		try {
			Integer x = q.head();
			
			log(" head() with empty queue: FAILED");
		} catch (NoSuchElementException ex) {
			log(" head() with empty queue: passed");
		}
		
		try {
			Integer x = q.dequeue();
			log(" dequeue() with empty queue: FAILED");
		} catch (NoSuchElementException ex) {
			log(" dequeue() with empty queue: passed");
		}
		
		q.enqueue(new Integer(1));
		q.enqueue(new Integer(2));
		int s = q.size();
		q.enqueue(new Integer(3));
		
		if (q.size() - s != 1) {
			log(" size() not checked");
		}
		
		if (! q.head().equals(new Integer(1))) {
			log(" head() failed");
		}
		if (! q.dequeue().equals(new Integer(1))) {
			log(" dequeue() failed: 1");
		}
		if (! q.dequeue().equals(new Integer(2))) {
			log(" dequeue() failed: 2");
		}
		if (! q.dequeue().equals(new Integer(3))) {
			log(" dequeue() failed: 3");
		}

		try {
			Integer x = q.dequeue();
			log(" dequeue() with empty queue: FAILED (second test)");
		} catch (NoSuchElementException ex) {
			log(" dequeue() with empty queue: passed (second test)");
		}		

		LQueue <Integer> q2 = new LQueue <Integer>();
		q2.enqueue(1);
		q2.enqueue(2);

		Collection<Integer> col = new LinkedList<>();
		col.add(3);
		col.add(4);

		q2.addAll(col);
		if (! q.dequeue().equals(new Integer(1))) {
			log(" dequeue() failed: 1");
		}
		if (! q.dequeue().equals(new Integer(2))) {
			log(" dequeue() failed: 2");
		}
		if (! q.dequeue().equals(new Integer(3))) {
			log(" dequeue() failed: 3");
		}
		if (! q.dequeue().equals(new Integer(4))) {
			log(" dequeue() failed: 2");
		}

		log("Seems ok");
	}
}
