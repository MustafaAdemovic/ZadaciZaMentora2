import java.util.Stack;

public class Queue {

	private Stack<Integer> first = new Stack<Integer>();
	private Stack<Integer> second = new Stack<Integer>();

	/**
	 * This is standard add method, we add members in first stack
	 * 
	 * @param value
	 */
	public void push(int value) {
		first.push(value);
	}

	/**
	 * This is standard remove method, and this method works with two stacks
	 * because stack works first in last out, and this is queue and it works
	 * first in first out, because that we need two stacks when we put members
	 * from first stack in second stack the member who was last in first stack
	 * now is a fist member in second stack.
	 * 
	 * @return
	 */
	public int pop() {
		if (second.isEmpty() == true) {

			while (first.isEmpty() == false) {
				second.push(first.pop());
			}
		}
		return (int) second.pop();
	}

	/**
	 * This method have for a task only to a write a first member because it is
	 * queue
	 * 
	 * @return
	 */
	public int peek() {
		return (int) second.peek();
	}

	/**
	 * This method have for a task to return a size of a queue.
	 * 
	 * @return size
	 */
	public int getSize() {
		return second.size();

	}

	/**
	 * Method as a parameter gets a index of some member in Queue ande return a
	 * value of member who is on this index
	 * 
	 * @param index
	 * @return value
	 */
	public int get(int index) {
		return (int) second.get(index);

	}
	
	

}
