// 2.2.4
public class Test {

    public static void main(String[] args)
    {
        Change instance1 = new Product();
        Change instance2 = new Sum();

        System.out.println(doo(instance1));
        System.out.println(doo(instance2));
    }

    public static int doo(Change ch)
    {
        return ch.modify(11);
    }

}
