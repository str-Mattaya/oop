import java.awt.*;

public abstract class Shape {

    private Point position;

    public Shape()
    {
        position = new Point(0, 0);
    }

    public Shape(Point p)
    {
        position = p;
    }

    public Point getPosition()
    {
        return this.position;
    }

    public abstract double getArea();

}
