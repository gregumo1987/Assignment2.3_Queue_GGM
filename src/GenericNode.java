/**
 * 
 * 
 * This class models a generic node, the data in the node and a pointer to the next node
 * @author Greg Gutierrez
 *
 * CS131ON
 */
public class GenericNode<T>{
	private T data;
	private GenericNode nextNode;
	
	/**
	 * This constructor makes a node that is empty
	 *
	 */	
public GenericNode() {
	setNextNode(null);
	data=null;
}//end empty-argument constructor


/**
 * This constructor makes a node that is equal to the values passed through the method
 *
 */	


public GenericNode(T data, GenericNode nextNode) {
	this.data=data;
	this.nextNode=nextNode;
}

/**
 * this method sets the data of this node
 *@param data to be set
 */	

public void setData(T data) {
	this.data=data;
}//end setData
/**
 * this method gets the data of this node
 *@return the data in this node
 */	

public T getData() {
	return this.data;
	
}//end getData
/**
 * this method returns a node that has been instantiated
 *@return this node
 */	

public GenericNode<T>getNode(){
	return this;
	
}//end getNode

/**
 * this method sets the next node
 *@param the node to be the next node
 */	


public void setNextNode(GenericNode<T> nextNode) {
	this.nextNode=nextNode;
}//end setNextNode

/**
 * this method gets the nextnode
 *@return the next node
 */	
public GenericNode getNextNode() {
	return nextNode;
}//end getNextNode
/**
 * this method allows the printing of a string 
 *@return data in node in a string
 */	
@Override
public String toString() {
	return " " + data + ", Next Person=" + nextNode + "";
}

}//end class