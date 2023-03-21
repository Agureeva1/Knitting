package Del;

import javax.swing.*;


import java.awt.*;

import static Del.Field.*;

public class NumberColumn extends JFrame {
    private int [] numberColumn;

    public NumberColumn () {
        numberColumn = new int[getColumns()];
    }
    public void paint(Graphics g) {

        int y = 80;
        int x = 100;
        g.setColor(new Color(29, 13, 123));
        int numberInt = 1;
        String numberString = Integer.toString(numberInt);
        for (int i = 1; i < getColumns(); i++) {
            //int x = 100;

           //     g.drawRect(x, y, 30, 30);
                g.drawString(numberString,30,30);
            numberInt = Integer.parseInt (numberString.trim ());
            numberInt++;
                x += 30;
            y += 30;
        }
    }
}
