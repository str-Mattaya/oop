class Circle extends Shape {

    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;

        // radius cant be less than zero
        if(this.radius < 0)
            this.radius = 0;
    }

    @Override
    public double getArea() {
        // A = pi*r^2
        return Math.PI * Math.pow(this.radius, 2);
    }
}

class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;

        // width cant be less than zero
        if(this.width < 0)
            this.width = 0;
        // height cant be less than zero
        if(this.height < 0)
            this.height = 0;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }
}

class Shape {

    private String name;

    public Shape(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public double getArea()
    {
        return 0;
    }

}

public class ShapeMain {

    public static void main(String args[])
    {
        Shape shapes[] = new Shape[3];
        shapes[0] = new Rectangle("A", 5.0, 10.0);
        shapes[1] = new Circle("B", 3.0);
        shapes[2] = new Circle("C", 4.0);

        System.out.println("Biggest = " +  findBiggest(shapes).getName());
    }

    private static Shape findBiggest(Shape shapes[])
    {
        Shape bs = null;
        // if 'Array of Shape' existes then bs has value
        if(shapes != null)
            bs = shapes[0];

        for(Shape sh : shapes)
        {
            if(sh.getArea() > bs.getArea())
            {
                bs = sh;
            }
        }

        return bs;
    }

}
