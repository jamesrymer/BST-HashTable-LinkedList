/*
 * Stores a patient object and contains pointers to other Nodes to assist in the creation of the BST
 */
public class Node {
	private Node l, r, p;
	private Patient patient;
	
	/*
	 * 	Creates a Node that stores a Patient object
	 */
	public Node(Patient patient) {
		this.patient = patient;
	}
	
	/*
	 * 	Returns the left child of the node
	 */
	public Node getL() {
		return l;
	}
	/*
	 * 	Sets the left child of the node to a specified Node
	 */
	public void setL(Node l) {
		this.l = l;
	}

	/*
	 * 	Returns the right child of the node
	 */
	public Node getR() {
		return r;
	}
	/*
	 * 	Sets the right child of the node to a specified value
	 */
	public void setR(Node r) {
		this.r = r;
	}

	/*
	 * 	Returns the Parent of the node
	 */
	public Node getP() {
		return p;
	}

	/*
	 * 	Sets the parent of the node to a specified value
	 */
	public void setP(Node p) {
		this.p = p;
	}
	
	/*
	 * 	Returns the patient that is stored in the node
	 */
	public Patient getPatient() {
		return patient;
	}

	/*
	 * 	Sets the value of the Patient that is stored in the node
	 */
	public void setPatient(Patient patient) {
		this.patient = patient;
	}

}
