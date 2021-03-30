class Coin {

    boolean isHead;
    //final stand for constant
    public static final int HEAD = 0;
    public static final int TAIL = 1;

    public Coin()
    {
        this.isHead = Math.random() >= 0.5;
    }

    public int getFace()
    {
        return this.isHead ? HEAD : TAIL;
    }

    public void flip()
    {
        this.isHead = !this.isHead;
    }

    public void spin()
    {
        this.isHead = Math.random() >= 0.5;
    }
}

public class Foo
{
    public static void main(String args[])
    {
        Coin c = new Coin();
        System.out.println(c.getFace());
        c.flip();
        System.out.println(c.getFace());
        c.spin();
        if(c.getFace() == Coin.HEAD)
        {
            System.out.println("Head!");
        }else if(c.getFace() == Coin.TAIL){
            System.out.println("Tail!");
        }
    }
}