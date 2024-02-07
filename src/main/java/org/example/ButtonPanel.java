package org.example;

import javax.swing.*;

import static org.example.SplitScrollPanel.*;


public class ButtonPanel extends JPanel {
    private final JPanel buttonPanel;

    public ButtonPanel(int r, int c) {

        buttonPanel = new JPanel();

        JButton save = new JButton("Сохранить");
        JButton clean = new JButton("Очистить");
        JButton backgroundSign = new JButton("Фон");

        clean.addActionListener(event -> {
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (getTmp()[i][j].getIcon() != null)
                        setTmpCell(i, j);
                }
            }
        });

        backgroundSign.addActionListener(event -> {
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    setTmpCellNewIcon(i, j);
                }
            }
        });

        buttonPanel.add(save);
        buttonPanel.add(clean);
        buttonPanel.add(backgroundSign);

    }

    public JPanel getButtonPanel() {
        return buttonPanel;
    }

}
