import java.util.ArrayList;

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

class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;

        if(this.width < 0)
            this.width = 0;
        if(this.height < 0)
            this.height = 0;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }
}

class Circle extends Shape {

    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;

        if(this.radius < 0)
            this.radius = 0;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}

public class ShapeMain {

    public static void init()
    {
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Rectangle("A", 5, 10));
        shapes.add(new Circle("A", 3));
        shapes.add(new Circle("A", 4));
        System.out.printf("Total area = %.2f\n", sumArea(shapes));
    }

    private static double sumArea(ArrayList<Shape> shapes)
    {
        double area = 0.0;
        for(Shape sh : shapes)
        {
            area += sh.getArea();
        }
        return area;
    }
}