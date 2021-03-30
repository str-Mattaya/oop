import java.*;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;


public class Main {

    public static void main(String args[])
    {
        Clock clock = new Clock(0, 0);
        clock.set_AMPM_Mode(false);

        Canvas canvas;
        
        if(!clock.is_AMPM_format)
            canvas = new Canvas("Clock Demo", 300, 150);
        else
            canvas = new Canvas("Clock Demo", 520, 150);

        canvas.setVisible(true);
        canvas.setFont(new Font("Dialog", Font.PLAIN, 96));

        int delay = 500;

        while(true)
        {
            canvas.erase();
            canvas.drawString(clock.toString(), 30, 100);
            canvas.wait(delay);
            
            canvas.erase();
            canvas.drawString(clock.commandAltRender(), 30, 100);
            canvas.wait(delay);
            
            clock.updateTick();
        }
    }

}