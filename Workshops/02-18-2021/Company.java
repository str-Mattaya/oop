import java.util.ArrayList;

public class Company{
    private String title;
    ArrayList<Employee> employees;

    public Company(String title){
        this.title = title;
        employees = new ArrayList<Employee>();
    }

    public String getTitle(){
        return title;
    }

    public void addEmployee(Employee e){
        employees.add(e);
    }

    public double getTotalExpense(){
        double sum = 0.0;
        for(Employee e : employees)
        {
            sum += e.getExpense();
        }
        return sum;
    }

    public void print(){
        for(Employee e : employees)
        {
            System.out.println(e);
        }
        System.out.printf("%s = %.0f\n", this.getTitle(), this.getTotalExpense());
    }
}