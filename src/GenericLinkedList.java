/**
 * 
 * This class models a generic linked list in which each genericNode has a pointer to the GenericNode after it, except the tail which do not have a GenericNode after.
 * @author Greg Gutierrez
 *
 * CS131ON
 */

//head= firstNode
//tail=lastNode

public class GenericLinkedList<T>  {
	private GenericNode head;//GenericNode to represent the head of the list
	private GenericNode tail;//GenericNode to represent the tail(end) of the list
	private int length;//variable to keep track of the number of elements in the list
	
/**
 * The constructor for this object initializes the list such that it is empty (no head or tail) node.
 * 
 */
	
public GenericLinkedList() {
	head=null;
	length=0;
	tail=head;
	
	
}//end empty-argument constructor
	
	

/** Method to see if there are any elements in the list.
* @return boolean if true/false
* 
*/
public boolean isEmpty() {
	
	if(head==null) {
		return true;
	}
	else return false;
}//edn isEmpty

/**
 * This method returns the head GenericNode of the list from which you can traverse the entire GenericNode links.
 * @return head
 * 
 */


public GenericNode getList() {
	
	return head;
}//end getList
	
/**
 * This method adds a new GenericNode to the list. It first checks to see if the list is empty. If so, it sets the tail GenericNodes
 * to the GenericNode passed in. If the list is not empty it places the GenericNodeat the end of the list and updates the pointers to the tail
 * .This implementation does not support adding entries to the middle of the list.
 * @param aNode 
 * 
 */


public void addNode(GenericNode aNode) {
	
	if(isEmpty()) {
		head=aNode;
		tail=head;
		return;
	}
	tail.setNextNode(aNode);
	tail=tail.getNextNode();
	tail.setNextNode(null);
	length++;
	
}//end addNode

	
}//end  GenericLinkedList class