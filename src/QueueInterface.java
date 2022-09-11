public interface QueueInterface<T> {

	

/*
 * @author Greg Gutierrez
 * Adds a new entry to the back of the this queue
 * @param newEntry an object to be added
 */
	
public void enqueue(T newEntry)	;

	

/*
 * Removes and returns the entry at the front of this queue/
 * @return the object at the front of the queue.
 * @throws EmptyQueueException if the queue is empty before the operation
 * 
 */	
public T dequeue() ;

/*
 *Detects whether this queue is empty.
 *@return true if the queue is empty. or false otherwise.
 *
 */	
public T getFront();

/*
 *Detects whether this queue is empty.
 *@return true if the queue is empty. or false otherwise.
 *
 */	
public boolean isEmpty();

/*
 *removes all entries from this queue.
 *
 */	
public  void clear();
	
	
	
}