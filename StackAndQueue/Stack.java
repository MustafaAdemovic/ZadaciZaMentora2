public class Stack {

	private Node head;
	private int min = 0;

	/**
	 * We make a empty constructor
	 */
	public Stack() {
		this.head = null;
	}

	/**
	 * This is standard add method who get for parameter a value, every time
	 * when we add a new member he go on a first place and next member is a
	 * previous member who was a head head, and in this method we check a member
	 * with minimal value, we have one if conditional who check if min is 0, min
	 * is now a value of first member, and if min is bigger than a value of
	 * newNode,min gets a value of newNode.
	 * 
	 * @param value
	 */
	public void push(int value) {
		Node newNode = new Node(value);
		newNode.setNext(head);
		head = newNode;
		if (min == 0) {

			min = newNode.getValue();
		} else if (min > newNode.getValue()) {
			min = newNode.getValue();
		}
	}

	


	/**
	 * This is like remove method it check if head is null that mean that the
	 * stack is empty, and it will inform us that we have exception with message
	 * "Stack is empty", value of head we give to new variable name current and
	 * head is now a second member we have new variable value who get a current
	 * value and after that we set a current to null and with this we have
	 * remove a current(last member- because it is a stack) and we return value;
	 * 
	 * @return value of current(last member in stack)
	 */
	public int pop() {
		if (head == null) {
			throw new NullPointerException("Stack is empty");
		}

		Node current = head;
		head = head.getNext();
		int value = current.getValue();
		current = null;
		return value;

	}

	/**
	 * This method have for task to return a minimal member in a stack
	 * 
	 * @return min minimal member in stack
	 */
	public int getMin() {
		return min;
	}

	/**
	 * This method only prints a value of last member in our case it is head
	 * because this is stack
	 * 
	 * @return a value of head
	 */
	public int peek() {
		if (head == null) {
			throw new NullPointerException("Stack is empty");
		} else {
			return head.getValue();
		}

	}

	/**
	 * This method check is the stack empty. If is, method return true.If is
	 * not, method return false.
	 * 
	 * @return true or false
	 */
	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		String str = "";
		str =str + head;
		return str;
	}

}
