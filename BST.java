/*
 * Creates and maintains a BST structure to store Patient Data
 */
public class BST {
	private Node root;
	
	/*
	 * Constructs a empty BST
	 */
	public BST() {
		root = null;
	}

	/*
	 * 	Deletes a specified Node from the BST
	 */
	public void TreeDelete(Node z) {
		
		if(z.getL() == null) {
			Transplant(z, z.getR());
		} else if(z.getR() == null) {
			Transplant(z, z.getL());
		} else {
			Node y = TreeMinimum(z.getR());
			if(y.getP() != z) {
				Transplant(y, y.getR());
				y.setR(z.getR());
				y.getR().setP(y);
			}
			Transplant(z, y);
			y.setL(z.getL());
			y.getL().setP(y);
		}
			
	}
	/*
	 * 	Returns the element with the smallest priority number
	 */
	public Node TreeMinimum(Node x) {
		while(x.getL() != null) {
			x = x.getL();
		}
		return x;
	}
	/*
	 * 	
	 */
	public void Transplant(Node u, Node v) {
		if(u.getP() == null) {
			root = v;
		} else if(u == u.getP().getL()) {
			u.getP().setL(v);
		} else {
			u.getP().setR(v);
		} 
		if(v != null) {
			v.setP(u.getP());
		}
	}
	
	/*
	 * 	Inserts an element into the BST
	 */
	public void TreeInsert(Node z) {
		Node y = null;
		Node x = root;
		
		while(x != null) {
			y = x;
			if(z.getPatient().getPriority() < x.getPatient().getPriority()) {
				x = x.getL();
			} else {
				x = x.getR();
			}
		}
		
		z.setP(y);
		
		if(y == null) {
			root = z;
		} else if(z.getPatient().getPriority() < y.getPatient().getPriority()){
			y.setL(z);
		} else {
			y.setR(z);
		}
		
	}
	
	/*
	 * 	Searches the tree for node containing the priority number specified
	 */
	public Node TreeSearch(Node x, int priority) {
		if(x == null || x.getPatient().getPriority() == priority) {
			return x;
		} 
		if(priority < x.getPatient().getPriority() ) {
			return TreeSearch(x.getL(), priority);
		} else {
			return TreeSearch(x.getR(), priority);
		}
	}
	
	/*
	 * 	Prints out the data representation in increasing order
	 */
	public void InOrderTreeWalk(Node x) {
		
		if(x.getPatient() != null) {
			
			if(x.getL() != null)
				InOrderTreeWalk(x.getL());
		
			System.out.println(x.getPatient());
		
			if(x.getR() != null)
				
				InOrderTreeWalk(x.getR());
		}
	}
	/*
	 * 	Returns the root Node of the BST
	 */
	public Node getRoot() {
		return root;
	}
	/*
	 * 	Sets the root Node value to a specified value
	 */
	public void setRoot(Node root) {
		this.root = root;
	}
	
}
