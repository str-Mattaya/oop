public class Sample {

    public static void main(String[] args)
    {
        String str = "qwerty";

        // catch NumberFormatException
        try
        {
            int i = Integer.parseInt(str);
            System.out.println(i);
        }
        catch(NumberFormatException exception)
        {
            System.out.println("-- Found: NumberFormatException --");
        }

        // catch RuntimeException which NumberFormatException extends from
        try
        {
            int i = Integer.parseInt(str);
            System.out.println(i);
        }
        catch(RuntimeException exception)
        {
            System.out.println("-- Found: RuntimeException --");
        }

        // catch Exception which RuntimeException extends from
        try
        {
            int i = Integer.parseInt(str);
            System.out.println(i);
        }
        catch(Exception exception)
        {
            System.out.println("-- Found: Exception --");
        }
    }

}
