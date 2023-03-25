package org.example;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SplitScrollPanel extends JPanel implements ListSelectionListener {

    private JList list;
    private JSplitPane splitPane;
    private String[] imageNames = {"лицевая петля", "изнаночная петля", "накид"};
    JButton tmp = new JButton();

    public SplitScrollPanel(int rows, int columns) {

        //Создаем список петель и помещаем его в область прокрутки

       list = new JList(imageNames);
        // за один раз можно выбрать один компонент списка петель
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //Для предопределенного выбора используйте метод setSelectedIndex(),
        // в котором вам нужно установить индекс элемента, который вы хотите видеть первым.
        list.setSelectedIndex(0);
        // добавляет слушателя
        list.addListSelectionListener(this);
// добавляет на скроллпанель список петель
        JScrollPane listScrollPane = new JScrollPane(list);
        // устанавливаем шрифт для списка петель
        list.setFont(new Font("Serif", Font.ITALIC, 14));

        //создаем панель для размещения поля
        JPanel panelForButton = new JPanel();
        panelForButton.setPreferredSize(new Dimension((rows*20)+120, (columns*20)+120));
        panelForButton.setLayout (null);
        int y = 60;
        for (int i = 0; i < rows; i++) {
            int x = 60;
            for (int j = 0; j < columns; j++) {

            //   JButton tmp = new JButton();
                tmp.setBackground(Color.WHITE);
                tmp.setBounds(x, y, 20, 20);
                IconAction iconAction = new IconAction(new ImageIcon());
               // tmp.setIcon(new ImageIcon("C:\\Users\\aagureeva\\IdeaProjects\\Knitting\\src\\main\\java\\loops\\лицевая петля.gif"));

             tmp.addActionListener(iconAction);
                panelForButton.add(tmp);
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
        // устанавливаем количество пикселей в панеле поля для рисования,
        // после указанного количества помещается разделитель
        splitPane.setDividerLocation(500);

        Dimension minimumSize = new Dimension(100, 100);
        listScrollPane.setMinimumSize(minimumSize);
        fieldScrollPane.setMinimumSize(minimumSize);
        splitPane.setPreferredSize(new Dimension(800, 500));
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        JList list = (JList) e.getSource();
        //  updateLabel(imageNames[list.getSelectedIndex()]);
    }

    public JList getImageList() {
        return list;
    }

    public JSplitPane getSplitPane() {
        return splitPane;
    }

private class IconAction implements ActionListener{

        private ImageIcon current;


        public IconAction(ImageIcon i) {
            current = i;
        }

    @Override
    public void actionPerformed(ActionEvent event) {
           if(list.getSelectedIndex()==0)
                tmp.setIcon(new ImageIcon("C:\\Users\\aagureeva\\IdeaProjects\\Knitting\\src\\main\\java\\loops\\лицевая петля.gif"));
        if(list.getSelectedIndex()==1)
            tmp.setIcon(new ImageIcon("C:\\Users\\aagureeva\\IdeaProjects\\Knitting\\src\\main\\java\\loops\\изнаночная петля.gif"));
        if(list.getSelectedIndex()==2)
            tmp.setIcon(new ImageIcon("C:\\Users\\aagureeva\\IdeaProjects\\Knitting\\src\\main\\java\\loops\\накид.gif"));

    }

    }
}

