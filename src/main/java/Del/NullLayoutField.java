package Del;

import javax.swing.*;
import java.awt.*;

public class NullLayoutField extends JPanel {

    private static JPanel panelForButton;

    public NullLayoutField(int rows, int columns) {
       panelForButton = new JPanel();
        int y = 30;
        panelForButton.setLayout(null);
        for (int i = 0; i < rows; i++) {
            int x = 30;
            for (int j = 0; j < columns; j++) {

                JButton tmp = new JButton();
                tmp.setBackground(Color.WHITE);
                tmp.setBounds(x, y, 20, 20);
                panelForButton.add(tmp);

                x += 20;
            }
            y += 20;
        }

        setBounds(30, 30, columns + 60, rows + 60);
    }

    public JPanel getPanelForButton() {
        return panelForButton;
    }

}
