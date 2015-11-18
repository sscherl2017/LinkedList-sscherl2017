public class Runner
{
	public static void main(String[] args)
	{
		LinkedList<String> tester = new LinkedList<String>();
		tester.add("milkshake");
		tester.add("pasta");
		/**
		tester.add("spaghetti");
		tester.add("milkshake");
		tester.add(null);
		tester.add("pasta");
		tester.add(null);
		tester.add("milkshake");
		*/
		tester.remove("milkshake");
		
		/**
		tester.add("fettuccini");
		tester.add("spaghetti");
		tester.add("olive oil");
		tester.add(null);
		tester.add(null);
		tester.add("chocolate");
		*/
		System.out.println("Head: " + tester.head);
		System.out.println("Tail: " + tester.tail);
		System.out.println("Size: " + tester.size());
		System.out.println();
		System.out.println(tester);
		
	}
}