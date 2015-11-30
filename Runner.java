public class Runner
{
	public static void main(String[] args)
	{
		/**
		LinkedList<String> tester = new LinkedList<String>();
		tester.add("potato");
		tester.add(null);
		tester.add("tomato");
		tester.add(null);
		tester.add(null);
		try
		{
			tester.add(-1, null);
		}
		catch (IndexOutOfBoundsException e)
		{
			System.out.println("Caught Index out of Bounds 1");
		}
		tester.add("tuna");
		tester.add("bacon");
		tester.add(null);
		try
		{
			tester.add(9, null);
		}
		catch (IndexOutOfBoundsException e)
		{
			System.out.println("Caught Index out of Bounds 2");
		}
		tester.add("ham");
		LinkedList<String> tester2 = new LinkedList<String>(tester);
		System.out.println(tester2);
		tester.add(0, null);
		System.out.println(tester);
		System.out.println(tester.get(0));
		try
		{
			tester.get(10);
		}
		catch (IndexOutOfBoundsException e)
		{
			System.out.println("Caught Index out of Bounds 3");
		}
		try
		{
			tester.get(-1);
		}
		catch (IndexOutOfBoundsException e)
		{
			System.out.println("Caught Index out of Bounds 4");
		}
		System.out.println(tester.get(4));
		System.out.println(tester.remove(0));
		System.out.println(tester.remove(3));
		System.out.println(tester);
		try
		{
			tester.remove(-1);
		}
		catch (IndexOutOfBoundsException e)
		{
			System.out.println("Caught Index out of Bounds 5");
		}
		try
		{
			tester.remove(8);
		}
		catch (IndexOutOfBoundsException e)
		{
			System.out.println("Caught Index out of Bounds 6");
		}
		System.out.println(tester.remove(null));
		System.out.println(tester.remove(null));
		System.out.println(tester.remove("green beans"));
		System.out.println(tester.remove("potato"));
		System.out.println(tester);
		tester.clear();
		LinkedList<String> tester3 = new LinkedList<String>(tester);
		System.out.println(tester3);
		System.out.println(tester.isEmpty());
		*/
		/**
		LinkedList<String> v = new LinkedList<String>();
v.add("1st");
v.add("2nd");
v.add(null);
v.add("4th");
v.add("5th");
v.add(2,"6th");
v.add(5,"7th");
System.out.println(v);
System.out.println("IndexOfNullThere " + v.indexOf(null));
System.out.println(v);
System.out.println("Get: " + v.get(3));
System.out.println(v);
System.out.println("RemoveIndex: " + v.remove(3));
System.out.println(v);
System.out.println("RemoveValue: " + v.remove("1st"));
System.out.println(v);
System.out.println("IndexOfNullNotThere " + v.indexOf(null));
System.out.println(v);
System.out.println("Set: " + v.set(1, "New"));
System.out.println(v);
System.out.println("ContainsNo: " + v.contains("3rd"));
System.out.println(v);
System.out.println("ContainsYes: " + v.contains("2nd"));
System.out.println(v);
System.out.println("isEmptyNo: " + v.isEmpty());
System.out.println(v);
System.out.println("clear: ");
v.clear();
System.out.println(v);
System.out.println("isEmptyYes: " + v.isEmpty());
System.out.println(v);
v.add("1st");
System.out.println("Another 1: ");
System.out.println(v);
v.add("2nd");
System.out.println("Another 2: ");
System.out.println(v);
LinkedList<String> s = new LinkedList<String>(v);
System.out.println("S:");
System.out.println(s);
System.out.println("V:");
System.out.println(v);
s.add("3rd");
System.out.println("S after adding a third:");
System.out.println(s);
System.out.println(" The same V:");
System.out.println(v);


Queue<String> q = new LinkedList<String>();
q.offer("1st");
q.offer("2nd");
q.offer("3rd");
q.offer("4th");
System.out.println("Poll: " + q.poll());
System.out.println(q);
*/
LinkedList<String> v = new LinkedList<String>();
v.add("1st");
v.add("2nd");
v.add(null);
v.add("4th");
v.add("5th");
v.add(2,"6th");
v.add(5,"7th");
System.out.println(v);
System.out.println("IndexOfNullThere " + v.indexOf(null));
System.out.println(v);
System.out.println("Get: " + v.get(3));
System.out.println(v);
System.out.println("RemoveIndex: " + v.remove(3));
System.out.println(v);
System.out.println("RemoveValue: " + v.remove("1st"));
System.out.println(v);
System.out.println("IndexOfNullNotThere " + v.indexOf(null));
System.out.println(v);
System.out.println("Set: " + v.set(1, "New"));
System.out.println(v);
System.out.println("ContainsNo: " + v.contains("3rd"));
System.out.println(v);
System.out.println("ContainsYes: " + v.contains("2nd"));
System.out.println(v);
System.out.println("isEmptyNo: " + v.isEmpty());
System.out.println(v);
System.out.println("clear: ");
v.clear();
System.out.println(v);
System.out.println("isEmptyYes: " + v.isEmpty());
System.out.println(v);
v.add("1st");
System.out.println("Another 1: ");
System.out.println(v);
v.add("2nd");
System.out.println("Another 2: ");
System.out.println(v);
LinkedList<String> n = new LinkedList<String>(v);
System.out.println("N:");
System.out.println(n);
System.out.println("V:");
System.out.println(n);
n.add("3rd");
System.out.println("N after adding a third:");
System.out.println(n);
System.out.println("The same V:");
System.out.println(v);

for (String iter : n)
{
System.out.println("For Each: " + iter);
}
System.out.println("\n");


Queue<String> q = new LinkedList<String>();
q.offer("1st");
q.offer("2nd");
q.offer("3rd");
q.offer("4th");
System.out.println("Poll: " + q.poll());
System.out.println(q);
System.out.println("Peek: " + q.peek());
System.out.println(q);

Stack<String> s = new LinkedList<String>();
s.push("1st");
s.push("2nd");
s.push("3rd");
s.push("4th");
s.push("5th");
System.out.println("Peek: " + s.peek());
System.out.println(s);
System.out.println("Pop: " + s.pop());
System.out.println(s);

	}
}