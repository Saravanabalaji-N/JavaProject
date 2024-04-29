package com.chainsys.list;

public class List {

	public static void main(String[] args) {
				ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(2, 4);
		System.out.println("The numbers are: " + numbers);

		ArrayList<String> names = new ArrayList<>();
		names.add("saravana");
		names.add("naveen");
		System.out.println("The numbers are: " + names);
		names.clear();
		names.add("akash");
		System.out.println("The numbers are: " + names);
		
		Queue<String> queue = new LinkedList<>();
		queue.offer("Saravana");
		queue.offer("Naveen");
		queue.offer("Balaji");
		System.out.println("poll :"+queue.poll());
		System.out.println("peek :"+queue.peek());
		queue.add("Akash");
		queue.remove("Akash");
		System.out.println(queue);

		Set<String> Set = new HashSet<String>();
		Set.add("Saravana");
		Set.add("Balaji");
		Set.add("Student");
		Set.add("Charan");
		Set.add("Akash");
		Set.remove("Charan");

		System.out.println(Set);

	}

}
