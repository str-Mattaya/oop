public class Circle extends Shape implements Zoomable
{

    private double radius;
    private double initial_radius;

    public Circle(String name, double radius)
    {
        super(name);
        this.radius = radius;
        this.initial_radius = radius;
    }

    public void zoom(double factor)
    {
        this.radius *= factor;
    }

    public void reset()
    {
        this.radius = this.initial_radius;
    }

    public double getArea()
    {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
