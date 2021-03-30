public class NumberDisplay
{

    int cap;
    int val = 0;

    public NumberDisplay(int cap)
    {
        this.cap = cap;
    }

    public int getValue()
    {
        return this.val;
    }

    public void setValue(int val)
    {
        this.val = val % cap;
    }

    public void addValue()
    {
        setValue( getValue() + 1 );
    }

    public void setCapacity(int cap)
    {
        this.cap = cap;
    }

    public int getCapacity()
    {
        return this.cap;
    }

}