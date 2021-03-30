import java.lang.Comparable;
import java.util.*;

public abstract class Student {
	
	private String name;
	private int age;
	private int numberOfCredit;
	
	public Student(String name, int age, int numberOfCredit)
	{
		this.name = name;
		this.age = age;
		this.numberOfCredit = numberOfCredit;
	}
	
	protected String getName()
	{
		return this.name;
	}
	
	protected int getNumberOfCredit()
	{
		return this.numberOfCredit;
	}
	
	public abstract double calculateTuition();

	// main function
	public static void main(String[] args)
	{
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new InternationalStudent("B", 21, 2, "2134323123"));
		list.add(new RegularStudent("A", 21, 2));
		list.add(new RegularStudent("C", 21, 2));
		list.add(new RegularStudent("F", 21, 2));

		// 2.2
		Collections.sort(list, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		for(Student std : list)
		{
			System.out.println(std.getName());
		}
	}
}
