public class HourlyEmployee extends Employee {

    private double wages;
    private double workHour;

    public HourlyEmployee(String name, String address, int number, double wages, double workHour)
    {
        super(name, address, Math.abs(number));
        this.wages = Math.abs(wages);
        this.workHour = Math.abs(workHour);
    }

    public double getWages()
    {
        return this.wages;
    }

    public double getWorkHour() {
        return workHour;
    }

    public HourlyEmployee setWages(double wages)
    {
        this.wages = wages;
        return this;
    }

    public HourlyEmployee setWorkHour(double workHour)
    {
        this.workHour = workHour;
        return this;
    }

    @Override
    public double computePay() {
        return this.workHour * this.wages;
    }

    // 2.1.2
    public static void main(String[] args)
    {
        HourlyEmployee[] employees = new HourlyEmployee[]{
                new HourlyEmployee("AABB", "BBHHS", 0, 1000, 8),
                new HourlyEmployee("asdf", "asdHHS", 1, 2000, 5)
        };

        for(HourlyEmployee m : employees)
        {
            String name = m.getName();
            String addr = m.getAddress();
            double wage = m.getWages();
            double wphr = m.getWorkHour();
            double paym = m.computePay();
            System.out.printf("%s %s %.2f %.2f %.2f\n", name, addr, wage, wphr, paym);
        }
    }
}
