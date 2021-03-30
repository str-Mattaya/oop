// 2.2.2
public class Product implements Change {

    @Override
    public int modify(int old) {
        return 2 * old;
    }
}
