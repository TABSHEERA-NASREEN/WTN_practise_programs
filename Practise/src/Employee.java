
public class Employee {
	private String name;
	private int id;


	public Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	public void Display()
	{
		System.out.println("Id: "+id+"  Name: "+name);
	}
}
