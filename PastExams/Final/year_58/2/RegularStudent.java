public class RegularStudent extends Student {
	
	public RegularStudent(String name, int age, int numberOfCredit)
	{
		super(name, age, numberOfCredit);
	}
	
	@Override
	public double calculateTuition()
	{
		return 1000 * this.getNumberOfCredit();
	}
	
}