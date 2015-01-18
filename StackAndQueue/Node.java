public class Node {

	private int value;
	private Node next;

	/**
	 * Constructor with one parameter
	 * 
	 * @param value
	 * @param next
	 */
	public Node(int value) {
		this.value = value;
		this.next = null;
	}

	/**
	 * Constructor with two parameters
	 * 
	 * @param value
	 * @param next
	 */
	public Node(int value, Node next) {
		this.value = value;
		this.next = next;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @return the next
	 */
	public Node getNext() {
		return next;
	}

	/**
	 * @param next
	 *            the next to set
	 */
	public void setNext(Node next) {
		this.next = next;
	}
}
