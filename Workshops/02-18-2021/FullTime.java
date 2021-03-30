public class FullTime extends Employee {

    private double salary;

    public FullTime(String name, double salary)
    {
        super(name);
        this.salary = salary >= 0 ? salary : 0;
    }

    @Override
    public double getExpense()
    {
        return this.salary;
    }

    public FullTime setSalary(double salary)
    {
        this.salary = salary >= 0 ? salary : 0;
        return this;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString()
    {
        return String.format("%s %.0f", this.getName(), this.getExpense());
    }

}