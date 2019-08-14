/*
 * Creates a Chaining Hash Table to store information on Patients
 */
public class HashTable {
	LinkedList [] hashTable;
	
	/*
	 * Instantiates a Chaining Hash Table with a specified size 
	 */
	public HashTable(int size) {
		hashTable = new LinkedList[size];
	}
	
	/*
	 * Inserts a Node into the Hash Table
	 */
	public void Insert(ChainNode n) {
		if(hashTable[Hash(n.getPatient().getPriority())] == null) {
			LinkedList list = new LinkedList();
			hashTable[Hash(n.getPatient().getPriority())] = list;
		}
		hashTable[Hash(n.getPatient().getPriority())].ListInsert(n);
	}
	
	/*
	 * Searches the Hash Table for a Patient with a specified priority key
	 */
	public ChainNode Search(int key) {
		if(hashTable[Hash(key)] == null) {
			return null;
		} 
		return hashTable[Hash(key)].search(key);
		
	}
	
	/*
	 * Deletes a specified patient from the HashTable
	 */
	public void delete(int key) {
		if(hashTable[Hash(key)] != null) {
			hashTable[Hash(key)].ListDelete(key);
		} 
	}
	
	/*
	 * Returns a string representation of a Hash Table Object
	 */
	public String toString() {
		String str = "";
		for(int i = 0; i < hashTable.length; i++) {
			if(hashTable[i] != null) {
				str += hashTable[i];
			}
		}
		return str;
	}
	
	/*
	 * Returns a index that a key is mapped to
	 */
	public int Hash(int key) {
		return key % hashTable.length;
	}
}
