import java.util.*;

public class MainCircle {
    
    public static void main(String[] args)
    {
        List<Shape> list = new ArrayList<Shape>();
        list.add(new Circle("A", 3));
        System.out.println(sumAreaIfZoom(list, 1));
        System.out.println(sumAreaIfZoom(list, 2));
        System.out.println(sumAreaIfZoom(list, 1));
    }

    public static double sumAreaIfZoom(List<Shape> shapes, double factor)
    {
        double area = 0;

        for(Shape sh : shapes)
        {
            if(sh instanceof Zoomable)
            {
                Zoomable z = (Zoomable) sh;
                z.zoom(factor);
                area += sh.getArea();
                z.reset();
            }
        }
        return area;
    }

}
