import java.util.*;

class LibScanner {

    public static HashMap<String, Integer> process()
    {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        Scanner sc = new Scanner(System.in);
        for(String arg = sc.nextLine(); !arg.equals("---"); arg = sc.nextLine())
        {
            String key = "";
            int value = 0;

            if(!arg.contains("-"))
            {
                if(!arg.contains("+")){
                    break;
                }else{
                    // "+" cant be use for regex
                    key = arg.split("\\+")[0];
                    value = Integer.valueOf(arg.split("\\+")[1]);
                }
            }else{
                key = arg.split("-")[0];
                value = -Integer.valueOf(arg.split("-")[1]);
            }

            // if there is no value in key position then create new key
            if(hm.get(key) == null)
                hm.put(key, 0);

            hm.put(key, hm.get(key) + value);

        }
        sc.close();

        return hm;
    }
}

public class LibMain {
    public static void main(String args[])
    {
        HashMap<String, Integer> hm = LibScanner.process();
        for(String key : hm.keySet())
        {
            System.out.println(key + ": " + hm.get(key));
        }
    }
}
