import java.util.*;

public class ArrayScanner {

    public static void main(String args[])
    {
        Scanner sc =  new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();

        // scan until value = "-1"
        for(String value = sc.nextLine(); !value.equals("-1"); value = sc.nextLine()) {
            // if array list does not contain value then add it
            if(!list.contains(value))
            {
                list.add(value);
            }
        }

        sc.close();

        //print list
        for(String str : list)
        {
            System.out.println(str);
        }
    }

}
