/**
 * 
 * 
 * This class creates a queue using the GenericNode and GenericLinkedLList
 * This implements the QueueInterface
 * @author Greg Gutierrez
 *
 * CS131ON
 */
public class Queue implements QueueInterface{

	private GenericNode firstNode;
	private GenericNode lastNode;
	private GenericLinkedList gLL;
	
	/**
	 * The constructor for this object initializes the queue
	 * 
	 */
	
	public Queue( GenericLinkedList gll) {
	firstNode=null;
	lastNode=null;
	this.gLL=gll;
	
	}
	

/** Method to add an object to the back of the linkedlist if queue is empty then the objct will be added to the front of the queue,if not it will be added to the back
* @param newEntry object to be added to the queue
* 
*/
	public void enqueue(Object newEntry) {
		// TODO Auto-generated method stub
	GenericNode<Object> NewNode=new GenericNode<Object>(newEntry,null);
	if(isEmpty()) {
		firstNode=NewNode;
		
	}
	else
		lastNode.setNextNode(NewNode);
		lastNode=NewNode;
	}

	
	/** Method to remove object from the start of the queue.makes the first node in the queue/list the value that was in the next node
	* @return front that value at the front of the queue.
	* 
	*/	
	public Object dequeue() {
		Object front=getFront();
		
		firstNode.setData(null);
		firstNode=firstNode.getNextNode();
		if(firstNode == null)
			lastNode=null;
		return front;
		
		
	}
	
	/** Method that returns the Object at the front of the queue
	* @return front that value at the front of the queue.
	* 
	*/	

	public Object getFront()  {
	
		return  firstNode.getData();
		
	}
	
	/** Method that checks to see if queue is empty or not
	* 
	* 
	*/	

	@Override
	public boolean isEmpty() {
		
		
			return (firstNode==null) &&(lastNode==null);
		
	}
	
	/** Method that clears the queue. 
	* 
	*/	

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		firstNode=null;
		lastNode=null;
	}

	/** Method that prints the properties of the Queue
	* @return string of restaurant and people in front of line
	*/	
	
	@Override
	public String toString() {
		return "VegeBurger Palace Queue: first Person in line=" + firstNode +"";
	}

		
	}//end class