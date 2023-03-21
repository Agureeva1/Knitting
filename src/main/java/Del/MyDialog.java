package Del;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyDialog extends JDialog {

    Font fontMyDialog = new Font("Verdana", Font.BOLD, 14);

public MyDialog(JFrame frame) {
           super(frame, "Вяжем с Леной", true);
setFont(fontMyDialog);
            add(new JLabel(
                            "Укажите размеры поля:") ,
                    BorderLayout.NORTH);
    add(new JLabel(
                    "Количество рядов:") ,
            BorderLayout.WEST);
    add(new JLabel(
                    "Количество колонок:") ,
           BorderLayout.CENTER);
            JPanel panel = new JPanel();
            JButton ok = new JButton("      OK      ");
    JTextField textRoWField= new JTextField(5);
    JTextField textColumField = new JTextField(5);
    JButton cansel = new JButton("Закрыть");
            ok.addActionListener(event -> setVisible(false));
    cansel.addActionListener(event->System.exit(0));
            panel.add(ok);
    panel.add(cansel);
    panel.add(textRoWField);
    panel.add(textColumField);
            add(panel, BorderLayout.SOUTH);
            setSize(350, 250);
    setLocationRelativeTo(null);
    setResizable(false);
    String textRoW = textRoWField.getText().trim();

    String textColum = textColumField.getText().trim();
        }


    }

