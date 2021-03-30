public abstract class Employee {

    private String name;
    private String address;
    private int id;

    public Employee(String name, String address, int id)
    {
        System.out.println("Constructing an Employee");
        this.name = name;
        this.address = address;
        this.id = id;
    }

    public String getName()
    {
        return this.name;
    }

    public String getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }

    public Employee setId(int id)
    {
        this.id = id;
        return this;
    }

    public Employee setAddress(String address)
    {
        this.address = address;
        return this;
    }

    public Employee setName()
    {
        this.name = name;
        return this;
    }

    public abstract double computePay();

    @Override
    public String toString() {
        return name + " " + address + " " + id;
    }
}
