import java.util.stream.*;
import java.util.*;
class StreamEx1 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList();

		/*list.add("Sunny");
		list.add("Bunny");
		list.add("Chinny");
		list.add("Mallika");
		list.add("Anusuka");
		*/
		list.add(20);
		list.add(10);
		list.add(30);
		list.add(70);
		list.add(40);
		list.add(50);
		System.out.println(list);

		//List<Integer> even = list.stream().filter(i->i%2==0).collect(Collectors.toList());//to print even numbers
		//List<Integer> stream = list.stream().filter(i->i%2==0).collect(Collectors.toList());
		List<Integer> marks = list.stream().map(i->i+5).collect(Collectors.toList());//add 5 marks each object
		//List<Integer> sortmarks = list.stream().sorted((I1,I2)->(I1<I2)?1:(I1>I2)?-1:0).collect(Collectors.toList());
		//List<String> sortmarks = list.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		
		Integer min = list.stream().min((I1,I2)->I1.compareTo(I2)).get();
		System.out.println("minum value:"+min);
		Integer max = list.stream().max((I1,I2)->I1.compareTo(I2)).get();
		System.out.println("minum value:"+max);
		//int odd =  list.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i); 
		//long numberoffailedstudent = list.stream().filter(i->i<35).count();
		//System.out.println("Soring : "+sortmarks);
		//System.out.println(numberoffailedstudent);

		list.stream().forEach(System.out::println);
		//How will you print unique squares of numbers in java 8?
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		Set<Integer> squrs = numbers.stream().map(i->i*i).collect(Collectors.toSet());
		System.out.println("unique squares:"+squrs);
		List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		//long count =
			strings.stream().forEach(System.out::println);
			//filter(s->s.isEmpty()).count();
		//System.out.println("count of strinr arr:"+count);
		
	}
}
