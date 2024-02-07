package org.example;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;


public class SplitScrollPanel extends JPanel implements ListSelectionListener {

    private static JList list;
    private final JSplitPane splitPane;
    private static final String[] imageNames = {"очистить", "лицевая петля", "изнаночная петля", "кромочная петля", "изнаночная скрещенная петля", "лицевая скрещенная петля", "петля платочной вязки", "снятая петля, нить за работой", "снятая петля, нить перед работой", "накид", "обратный накид", "свободный накид", "две вместе лицевой с наклоном влево(протяжка)", "две вместе лицевой с наклоном вправо", "три вместе лицевой методом перестановки(двойная протяжка)", "три вместе изнаночной", "три вместе методом перекида", "четыре вместе лицевой", "четыре вместе изнаночной", "три лицевые петли из трех вместе"};
    private static JButton[][] tmp;
    private static ImageIcon picture = new ImageIcon("src\\main\\java\\нитки.gif");


    public SplitScrollPanel(int rows, int columns) {

        list = new JList(imageNames);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setSelectedIndex(1);
        list.addListSelectionListener(this);
        JScrollPane listScrollPane = new JScrollPane(list);
        // устанавливаем шрифт для списка петель
        list.setFont(new Font("Serif", Font.ITALIC, 14));

        //создаем панель для размещения поля
        JPanel panelForButton = new JPanel();
        panelForButton.setPreferredSize(new Dimension((rows * 20) + 120, (columns * 20) + 120));
        //  panelForButton.setPreferredSize(new Dimension(600, 500));
        panelForButton.setLayout(null);
        JButton iconCone = new JButton();
        iconCone.setMargin(new Insets(0, 0, 0, 0));
        iconCone.setBackground(Color.WHITE);
        iconCone.setBounds(40, 40, 20, 20);
        iconCone.setIcon(picture);
        iconCone.setDisabledIcon(picture);
        iconCone.setEnabled(false);
        panelForButton.add(iconCone);

        int hy = 40;
        int hx = 60;
        JButton[] horizontalNumber = new JButton[columns];
        for (int h = 0; h < columns; h++) {
            horizontalNumber[h] = new JButton(String.valueOf(h + 1));
            horizontalNumber[h].setMargin(new Insets(0, 0, 0, 0));
            horizontalNumber[h].setFont(new Font("Serif", Font.BOLD, 10));
            horizontalNumber[h].setBackground(Color.WHITE);
            horizontalNumber[h].setBounds(hx, hy, 20, 20);

            panelForButton.add(horizontalNumber[h]);
            hx += 20;
        }


        int vy = 60;
        int vx = 40;
        JButton[] verticalNumber = new JButton[rows];
        for (int v = 0; v < rows; v++) {
            verticalNumber[v] = new JButton(String.valueOf(v + 1));
            verticalNumber[v].setMargin(new Insets(0, 0, 0, 0));
            verticalNumber[v].setFont(new Font("Serif", Font.BOLD, 10));
            verticalNumber[v].setBackground(Color.WHITE);
            verticalNumber[v].setBounds(vx, vy, 20, 20);

            panelForButton.add(verticalNumber[v]);

            vy += 20;
        }

        int y = 60;
        tmp = new JButton[rows][columns];
        for (int i = 0; i < rows; i++) {
            int x = 60;
            for (int j = 0; j < columns; j++) {

                tmp[i][j] = new JButton();
                tmp[i][j].setBackground(Color.WHITE);
                tmp[i][j].setBounds(x, y, 20, 20);
                int finalJ = j;
                int finalI = i;
                tmp[i][j].addActionListener(event -> tmp[finalI][finalJ].setIcon(new ImageIcon("src\\main\\java\\loops\\" + imageNames[list.getSelectedIndex()] + ".gif")));
                panelForButton.add(tmp[i][j]);
                x += 20;
            }
            y += 20;
        }

        JScrollPane fieldScrollPane = new JScrollPane(panelForButton);

        //добавляем горизонтальный разделитель на панели
        splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, fieldScrollPane,
                listScrollPane);
        //TODO не понимаю на что влияет этот метод, изначально стоял true
        splitPane.setOneTouchExpandable(false);
        splitPane.setDividerLocation(600);

        Dimension minimumSize = new Dimension(200, 300);
        listScrollPane.setMinimumSize(minimumSize);
        fieldScrollPane.setMinimumSize(minimumSize);
        splitPane.setPreferredSize(new Dimension(1000, 450));
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {

    }

    public JSplitPane getSplitPane() {
        return splitPane;
    }

    public static JButton[][] getTmp() {
        return tmp;
    }

    public static void setTmpCell(int r, int c) {
        SplitScrollPanel.tmp[r][c].setIcon(null);
    }

    public static void setTmpCellNewIcon(int r, int c) {
        SplitScrollPanel.tmp[r][c].setIcon((new ImageIcon("src\\main\\java\\loops\\" + imageNames[list.getSelectedIndex()] + ".gif")));
    }

    public static void setTmpCellFromToNewIcon(int numRow, int from, int to) {
        for (int i = from - 1; i < to; i++) {
            SplitScrollPanel.tmp[numRow-1][i].setIcon((new ImageIcon("src\\main\\java\\loops\\" + imageNames[list.getSelectedIndex()] + ".gif")));
        }
    }
}

