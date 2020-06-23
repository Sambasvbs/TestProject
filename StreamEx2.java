import java.util.*;
import java.util.stream.*;
class StreamEx2 
{
	private static Employee[] arrayOfEmps = {
    new Employee(1, "Jeff Bezos", 100000.0), 
    new Employee(2, "Bill Gates", 200000.0), 
    new Employee(3, "Mark Zuckerberg", 300000.0)
};
	public static void main(String[] args) 
	{
		List<String> list = new ArrayList();
		list.add("samba");
		list.add("jagadesh");
		list.add("Madhu");
		list.add("Rama");
		list.add("Rajesh");
		list.add("Latha");
		for(String s:list){
		System.out.println(s);
		}
		System.out.println("*********************");
		List<String> newlist = list.stream().filter(s->s.startsWith("R")).collect(Collectors.toList());
		newlist.stream().forEach(System.out::println);
		System.out.println("*********After strem operations************");
		for(String s:list){
		System.out.println(s);

		Stream.of(arrayOfEmps);
		}
	}
}

class Employee
{
	private String name;
	private int eid;
	private double sal;

	public Employee(int eid,String name,double sal){
		
			this.eid=eid;
			this.name=name;
			this.sal= sal;

	}
};