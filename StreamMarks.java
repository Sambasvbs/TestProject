import java.util.stream.*;
import java.util.*;
class StreamMarks 
{protected int x,y;
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList();

		list.add(11);
		list.add(10);
		list.add(14);
		list.add(17);
		list.add(18);
		list.add(12);
		//System.out.println(list);

		//List<Integer> stream = list.stream().map(i->i+5).collect(Collectors.toList());
		list.stream().peek(s->System.out.println(s+""));
		//System.out.println(stream);

	Stream.of("one", "two", "three", "four")
  //.filter(e -> e.length() > 3)
  //.peek(e -> System.out.println("Filtered value: " + e))
  //.map(String::toUpperCase)
  .peek(e -> System.out.println("Mapped value: " + e));
  //.collect(Collectors.toList());

String s=String.join("-","a","b");

StreamMarks streamMarks= new StreamMarks();

System.out.println(streamMarks.x+""+streamMarks.y);	
	}
}
