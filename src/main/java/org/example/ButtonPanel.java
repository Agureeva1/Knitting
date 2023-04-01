package org.example;

import javax.swing.*;

import static org.example.SplitScrollPanel.getTmp;
import static org.example.SplitScrollPanel.setTmpCell;


public class ButtonPanel extends JPanel {
    private final JPanel buttonPanel;

    public ButtonPanel(int r, int c) {

        buttonPanel = new JPanel();
        JButton sign = new JButton("Обозначения");
        JButton save = new JButton("Сохранить");
        JButton clean = new JButton("Очистить");

        clean.addActionListener(event -> {
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (getTmp()[i][j].getIcon() != null)
                        setTmpCell(i, j);
                }
            }
        });
        buttonPanel.add(sign);
        buttonPanel.add(save);
        buttonPanel.add(clean);

    }

    public JPanel getButtonPanel() {
        return buttonPanel;
    }

}
