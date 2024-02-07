package org.example;

import javax.swing.*;

import java.awt.*;

import static org.example.SplitScrollPanel.*;

public class InputPanel extends JPanel {
    private final JPanel inputPanel;

    public InputPanel(int rows, int columns) {

        inputPanel = new JPanel(new FlowLayout());
        JLabel label1 = new JLabel("Укажите номер строки: ");
        JTextField textFieldNumberRow = new JTextField(10);
        JLabel label2 = new JLabel(", укажите номер ячеек: с");
        JTextField textFieldFrom = new JTextField(10);
        JLabel label3 = new JLabel(" - по");
        JTextField textFieldTo = new JTextField(10);

        JButton button = new JButton("OK");

        button.addActionListener(e ->  {
                int y = 0;
            int yy = 0;
            int yyy = 0;

                try {
                    y = Integer.parseInt(textFieldNumberRow.getText());
                    yy = Integer.parseInt(textFieldFrom.getText());
                    yyy = Integer.parseInt(textFieldTo.getText());
                } catch (NumberFormatException e1) {
                    JOptionPane.showMessageDialog(inputPanel, "Некорректный ввод!");
                }

            if (y>rows || y<1 ) JOptionPane.showMessageDialog(inputPanel, "Номер строки должен быть не меньше 1 и не больше " + rows);
            else if (yy>columns || yy<1 ) JOptionPane.showMessageDialog(inputPanel, "Первая ячейка должен быть не меньше 1 и не больше " + columns);
            else if (yyy>columns) JOptionPane.showMessageDialog(inputPanel, "Последняя ячейка не может быть больше " + columns);
            else if (yy>yyy) JOptionPane.showMessageDialog(inputPanel, "Первая ячейка не может быть больше последней ячейки");
            else {setTmpCellFromToNewIcon(y,yy,yyy);}
        });

        inputPanel.add(label1);
        inputPanel.add(textFieldNumberRow);
        inputPanel.add(label2);
        inputPanel.add(textFieldFrom);
        inputPanel.add(label3);
        inputPanel.add(textFieldTo);
        inputPanel.add(button);

    }

    public JPanel getInputPanel() {
        return inputPanel;
    }

}
