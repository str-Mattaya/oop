public class PartTime extends Employee {

    private double payPerHour;
    private int hour;

    public PartTime(String name, double paymentPerHour, int workingHour)
    {
        super(name);
        this.payPerHour = paymentPerHour >= 0 ? paymentPerHour : 0;
        this.hour = workingHour >= 0 ? workingHour : 0;
    }

    @Override
    public double getExpense()
    {
        return this.payPerHour * this.hour;
    }

    public PartTime setWorkingHour(int workingHour)
    {
        this.hour = workingHour >= 0 ? workingHour : 0;
        return this;
    }

    public PartTime setPaymentPerHour(double paymentPerHour)
    {
        this.payPerHour = paymentPerHour >= 0 ? paymentPerHour : 0;
        return this;
    }

    public int getWorkingHour()
    {
        return this.hour;
    }

    public double getPaymentPerHour()
    {
        return this.payPerHour;
    }

    @Override
    public String toString()
    {
        return String.format("%s %.0f x %d = %.0f", this.getName(), this.payPerHour, this.hour, this.getExpense());
    }

}
