/*
 * Stores Nodes bin a doubly linked list structure that contain Information about patients
 */
public class LinkedList {
	ChainNode head;
	
	/*
	 * Creates an empty list
	 */
	public LinkedList() {
		head = null;
	}
	
	/*
	 * Inserts a Node in the front of the Linked List
	 */
	public void ListInsert(ChainNode n) {
		if(head == null) {
			head = n;
		} else {
			ChainNode temp = head;
			head = n;
			head.next = temp;
		}
	}
	
	/*
	 * Deletes a Node from the List
	 */
	public void ListDelete(int key) {
		ChainNode n = head;
		
		if(n != null && n.getPatient().getPriority() == key) {
			head = n.getNext();
		}
		
		while(n != null && n.getPatient().getPriority() != key) {
			n = n.getNext();
		}
		if(n.getPatient().getPriority() == key ) {
			n.setPrevious(n.getNext());
		}
	}
	
	/*
	 * Returns a string representation of the List object
	 */
	public String toString() {
		String str = "";
		ChainNode temp = head;
		while(temp != null) {
			str += temp.getPatient() + "\n";
			temp = temp.getNext();
		}
		return str;
	}

	/*
	 * Searches for a Node in the List
	 */
	public ChainNode search(int key) {
	
		if(head.getPatient().getPriority() == key) {
			return head;
		}
		ChainNode temp = head;
		
		while(temp != null) {
			if(temp.getPatient().getPriority() == key) {
				return temp;
			}
			temp = temp.getNext();
		}
		return null;
	}
}
