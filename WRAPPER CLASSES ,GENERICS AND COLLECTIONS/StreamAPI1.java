import java.util.stream.Stream;
import java.util.*;
public class StreamAPI1
{
	public static void main (String args[])
	{//first way to create stream using Stream.of
		Stream<Integer> stream = Stream.of(1,2,3,4,5);
		stream.forEach(System.out::println);
		
		Stream<String> stream1 = Stream.of("aa","nn","aa");
		stream1.forEach(System.out::println);
		// stream creation by second method
		ArrayList<Integer> al = new ArrayList<>();
		al.add(2);
	al.add(1);
	al.add(2);
	al.add(3);
	al.add(5);
	al.add(3);
	al.add(7);
		Stream<Integer> stm = al.stream();
		stm.forEach(System.out::println);
		
		ArrayList<String> all = new ArrayList<>();
		all.add("harshit");
	all.add("anushka");
	all.add("rishika");
	all.add("ishika");
	all.add("vanshika");
	all.add("drishya");
	all.add("arjun");
		//Stream<String> stm1 = all.stream();
	   //stm1.forEach(System.out::println);
		//Stream<String> filterStream = stm1.filter(n->n.startsWith("a"));
	
		all.stream().filter(n->n.startsWith("a")).forEach(System.out::println);
		
	}
}