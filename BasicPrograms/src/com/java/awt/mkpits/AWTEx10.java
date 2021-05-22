//Example of canvas

package com.java.awt.mkpits;
import java.awt.*;
public class AWTEx10

{
    public AWTEx10 ()
    {
        Frame canvas_f= new Frame(" Canvas");
        canvas_f.add(new CanvasDemo());
        canvas_f.setLayout(null);
        canvas_f.setSize(500, 500);
        canvas_f.setVisible(true);
    }
    public static void main(String args[])
    {
        new AWTEx10 ();
    }
}
class CanvasDemo extends Canvas
{
    public CanvasDemo() {
        setBackground (Color.WHITE);
        setSize(300, 200);
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.blue);
        g.fillOval(80, 80, 150, 75);
    }
}

