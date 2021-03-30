class Display {

    // This is abstract by the way
    private int len;
    private String txt;

    public Display(int len)
    {
        this.len = len;
    }

    public int getLen() {
        return len;
    }

    public void setText(String text)
    {
        this.txt = text;
        System.out.println(this.txt);
    }

    public void blink()
    {
        System.out.println("");
        System.out.println(this.txt);
    }
}

class Controller {

    private Display display;
    private String originalText;
    private String currentText;

    private int lastIndex;
    private int firstIndex;

    public Controller(Display display)
    {
        this.display = display;
        this.currentText = "";
        this.originalText = "";
        this.lastIndex = 0;
        this.firstIndex = 0;
    }

    private void shift()
    {
        this.currentText = this.originalText.substring(this.firstIndex, this.lastIndex);

        display.setText(this.currentText);
        if(this.lastIndex - this.firstIndex + 1 > display.getLen())
        {
            this.firstIndex++;
        }
        this.lastIndex++;
    }

    public void work(String text)
    {
        this.originalText = text;
        while(this.lastIndex <= this.originalText.length())
        {
            shift();
            Controller.waiT(500);
        }
        this.display.blink();
    }

    private static void waiT(long ms)
    {
        try {
            Thread.sleep(ms);
        } catch(Exception e){}
    }
}

public class DisplayMain {

    public static void main(String args[])
    {
        Controller c = new Controller(new Display(6));
        c.work("This_is_a_test.");
    }

}
