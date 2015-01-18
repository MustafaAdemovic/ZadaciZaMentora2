public class QueueTest {

	public static void main(String[] args) {

		Queue queue = new Queue();

	/*  queue.push(1);
		queue.push(2);
		queue.push(45);
		queue.push(65);
		queue.push(2);
		queue.push(4);
		queue.push(6);
		queue.pop();
		System.out.println(queue.getSize());
		System.out.println(queue.get(3));
		
		 * Rezultati s konzole
		 * 
		 * 6 65
		 * 
		                           */
		

		for (int i = 0; i < 5; i++) {

			queue.push(i + 1);
		}
		for (int i = 0; i < 5; i++) {

			System.out.println(queue.pop());
			
			/*
			 * Rezultati s konzole:
			 * 
			 * 1 2 3 4 5
			 */

		}

	}
}
