public class StackTest {

	public static void main(String[] args) {

		Stack stack = new Stack();

		for (int i = 0; i < 5; i++) {
			stack.push(i + 1);
		}
		for (int i = 0; i < 5; i++) {

			System.out.println(stack.pop());
		}
		System.out.println("Minimal value: " + stack.getMin());
		/*
		 * Rezultati s konzole:
		 * 
		 * 5
		 * 4 
		 * 3 
		 * 2 
		 * 1
		 *  
		 * Minimal value: 1
		 */

	}

}
