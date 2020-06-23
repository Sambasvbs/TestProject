class person
{
	public static void show(person p){
	System.out.println("person");
	}
};
class Employee extends person
{
	public static  void show(Employee p){
	System.out.println("Employee");
	}
};

class TestJava 
{
	
	public static void print(person obj){
	show(obj);
	}
	public static void main(String[] args) 
	{
		char ch[]={'c','d','c','d','c','d'};
		System.out.println(ch.length);
		person p = new person();
		person x = new Employee();
		Employee e = new Employee();
		print(p);print(x);print(e);


	}
}
