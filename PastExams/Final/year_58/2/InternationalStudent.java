// 2.1
public class InternationalStudent extends Student {
	
	private String visaID;
	
	public InternationalStudent(String name, int age, int numberOfCredit, String visaID)
	{
		super(name, age, numberOfCredit);
		this.visaID = visaID;
	}
	
	protected String getVisaID()
	{
		return this.visaID;
	}

	protected InternationalStudent setVisaID(String visaID)
	{
		this.visaID = visaID;
		return this;
	}
	
	@Override
	public double calculateTuition()
	{
		return 5000 * this.getNumberOfCredit();
	}
	
}