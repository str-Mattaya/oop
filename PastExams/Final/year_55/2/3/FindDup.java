import java.util.HashSet;
import java.util.Set;

public class FindDup {

    public static void main(String[] args)
    {
        String input = new String("car home house book car book");
        String[] word = input.split(" ");

        Set<String> uniques = new HashSet<String>();
        Set<String> duplicates = new HashSet<String>();

        for(String str : word)
        {
            // if str cant be insert in uniques then try to insert in duplicates
            if(!uniques.add(str))
                duplicates.add(str);
        }

        // uniques still have all duplicated value so remove all duplicated value to make it real uniques
        uniques.removeAll(duplicates);

        System.out.println(uniques);
        System.out.println(duplicates);
    }

}
