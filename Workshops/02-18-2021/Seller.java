public class Seller extends Employee {

    private double salary;
    private double percentProfit;
    private double turnOver;

    public Seller(String name, double salary, double percentProfit, double turnOver)
    {
        super(name);
        this.salary = salary >= 0 ? salary : 0;
        this.percentProfit = percentProfit >= 0 ? percentProfit / 100.0 : 0;
        this.turnOver = turnOver >= 0 ? turnOver : 0;
    }

    @Override
    public double getExpense()
    {
        return this.salary + ( this.percentProfit * this.turnOver );
    }

    public Seller setSalary(double salary)
    {
        this.salary = salary >= 0 ? salary : 0;
        return this;
    }

    public Seller setPercentProfit(double percentProfit)
    {
        this.percentProfit = percentProfit >= 0 ? percentProfit / 100.0 : 0;
        return this;
    }

    public Seller setTurnOver(double turnOver)
    {
        this.turnOver = turnOver >= 0 ? turnOver : 0;
        return this;
    }

    public double getSalary()
    {
        return this.salary;
    }

    public double getTurnOver()
    {
        return this.turnOver;
    }

    public double getPercentProfit()
    {
        return this.percentProfit * 100.0;
    }

    @Override
    public String toString()
    {
        return String.format("%s %.0f + (%.2f x %.0f) = %.0f", this.getName(), this.salary, this.percentProfit, this.turnOver, this.getExpense());
    }

}
