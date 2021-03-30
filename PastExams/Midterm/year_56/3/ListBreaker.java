import java.util.*;

public class ListBreaker {

    public static ArrayList<String> parse(String input) {
        // "a bc, def, ge" ==split(",")==> {"a bc", " def", " ge"}
        String[] st_arr = input.split(",");
        ArrayList<String> list_str = new ArrayList<String>();
        
        for(String tmp : st_arr) {

            // " def" ==trim()==> "def"
            // "afg " ==trim()==> "afg"
            // "a bc" ==trim()==> "a bc"
            String str = tmp.trim();

            if(str.startsWith("A9")) {
                // "A92847" ==> "28"
                list_str.add(str.substring(2, 4));
            } else if(str.startsWith("B1")) {
                // "B14826" ==> "26"
                list_str.add(str.substring(str.length() - 2));
            } else {
                // "C418" ==> "C418"
                list_str.add(str);
            }
        }

        return list_str;
    }

    public static void main(String args[])
    {
        ArrayList<String> arr = ListBreaker.parse("A9C1888, B13D66, B13455, B18211, A97663");
        for(String str : arr)
        {
            System.out.println(str);
        }
    }

}
