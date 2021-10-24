package Shildt.JavaBean;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.Serializable;

public class COLORS extends Canvas implements Serializable {
    transient private Color color; //несохраняемая переменная
    private boolean rectangular;

    public COLORS() {
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent me) {
                change();
            }
        });

        rectangular = false;
        setSize(100,100);
        change();
    }


    public boolean getRectangular() {
        return rectangular;
    }

    public void setRectangular(boolean rectangular) {
        this.rectangular = rectangular;
    }

    private void change() {
        color = rendomColor();
        repaint();
    }
    private Color rendomColor(){
        int r = (int ) (255*Math.random());
        int g = (int ) (255*Math.random());
        int b= (int ) (255*Math.random());
        return new Color(r,g,b);
    }
    public void paint(Graphics g){
        Dimension d = getSize();
        int h = d.height;
        int w = d.width;
        g.setColor(color);
        if (rectangular){
            g.fillRect(0,0,w-1,h-1);
        }else {
            g.fillOval(0,0,w-1,h-1);
        }
    }
}
