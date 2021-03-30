public class Main{
    public static void main(String[] args){
        Company c = new Company("CoE");
        //Employees
        FullTime jane = new FullTime("Jane", 30000);
        Seller john = new Seller("John", 10000, 1, 150000);
        FullTime randy = new FullTime("Randy", 18000);
        PartTime josh = new PartTime("Josh", 150, 80);
        PartTime marry = new PartTime("Marry", 100, 60);

        c.addEmployee(jane);
        c.addEmployee(john);
        c.addEmployee(randy);
        c.addEmployee(josh);
        c.addEmployee(marry);

        c.print();        
    }
}