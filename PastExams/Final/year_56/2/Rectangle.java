import java.awt.*;

public class Rectangle extends Shape implements Zoomable {

    private double width;
    private double height;

    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    public Rectangle(Point position, double width, double height)
    {
        super(position);
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public Rectangle setWidth(double width)
    {
        this.width = width;
        return this;
    }

    public Rectangle setHeight(double height)
    {
        this.height = height;
        return this;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    // 2.1.2

    @Override
    public void zoom(double factor) {
        this.width *= factor;
        this.height *= factor;
    }
}
