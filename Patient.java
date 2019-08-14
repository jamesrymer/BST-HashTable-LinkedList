/*
 * Stores the information of a patient
 */
public class Patient {
	int priority;
	String name;
	
	/*
	 * Returns the name of the patient
	 */
	public String getName() {
		return name;
	}
	
	/*
	 * Sets the name of a patient to a specified value
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/*
	 * creates a Patient object 
	 */
	public Patient(int priority, String name) {
		this.priority = priority;
		this.name = name;
	}

	/*
	 * Returns the priority number of a patient
	 */
	public int getPriority() {
		return priority;
	}

	/*
	 * Sets the priority number of a patient to a specified value
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	/*
	 * Returns a string representation of a Patient object
	 */
	public String toString() {
		
		return "Name: " + name + "\t Priority: " + priority;
	}
}
