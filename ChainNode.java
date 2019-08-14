/*
 * Stores pointers to other ChainNodes to assist the LinkedList class
 */
public class ChainNode {
	ChainNode next;
	ChainNode previous;
	Patient patient;
	
	/*
	 * Creates a ChainNode object and stores a Patient object
	 */
	public ChainNode(Patient patient) {
		this.patient = patient;
	}
	
	/*
	 * Returns the next node
	 */
	public ChainNode getNext() {
		return next;
	}
	
	/*
	 * Sets the value of next to a specified value
	 */
	public void setNext(ChainNode next) {
		this.next = next;
	}
	
	/*
	 * Returns the value of Patient
	 */
	public Patient getPatient() {
		return patient;
	}
	
	/*
	 * Sets the value of patient to a specified value
	 */
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	/*
	 * Returns the value of Previous
	 */
	public ChainNode getPrevious() {
		return previous;
	}
	
	/*
	 * Sets the value of Previous
	 */
	public void setPrevious(ChainNode previous) {
		this.previous = previous;
	}
}
