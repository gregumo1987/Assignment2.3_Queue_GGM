/**
 * 
 * 
 * This class instantiates a linkedlist and queue. this is test class where we practice enqueing and dequeuing strings of people's names
 * @author Greg Gutierrez
 *
 * CS131ON
 */
public class Application {



	public static void main(String[] args) {
		
		GenericLinkedList<String> newList=new GenericLinkedList<String>();
	
		Queue myQueue=new Queue(newList);
		
	

		
		myQueue.enqueue("Bill");
		System.out.println(myQueue.toString());
		
		myQueue.enqueue("Alice");
		
		System.out.println(myQueue.toString());
		
		
		myQueue.enqueue("Bob");
		
		System.out.println(myQueue.toString());
		
		myQueue.dequeue();
		
		System.out.println(myQueue.toString());
		
			
		myQueue.enqueue("Jane");
		System.out.println(myQueue.toString());
		
		
		myQueue.enqueue("Hamad");
		System.out.println(myQueue.toString());
		
		myQueue.dequeue();
		System.out.println(myQueue.toString());
		
		myQueue.dequeue();
		System.out.println(myQueue.toString());
		
		myQueue.enqueue("Jim");
		System.out.println(myQueue.toString());
		
		myQueue.dequeue();
		
		System.out.println(myQueue.toString());
		
		myQueue.dequeue();
		
		System.out.println(myQueue.toString());
		

	}//end main method

}//end Application class