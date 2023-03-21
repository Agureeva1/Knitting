package Del;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class SplitPane extends JPanel implements ListSelectionListener {


    private JList list;
    private JSplitPane ssplitPane;
    private String[] imageNames = {"петля", "изнаночная петля", "накид", "столбик с накидом"};


    public SplitPane(int rows, int columns,int splitPaneX,int pX,int pY) {

        //Создаем список петель и помещаем его в область прокрутки
        super();

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
        list.setFont(new Font("Serif",Font.ITALIC,14));

        //создаем панель для размещения поля

        JPanel panelForButton = new JPanel();
        panelForButton.setPreferredSize(new Dimension(pX, pY));
        //добавляем на панель для размещения поля сетку, в ячейки которой будут добавляться кнопки
      //  panelScrollButton.setLayout(new GridLayout(rows, columns));
        panelForButton.setLayout (new FlowLayout(FlowLayout.CENTER,0,0));
       // FlowLayout ExperimentLayout = new FlowLayout(FlowLayout.CENTER,0,0);

       // panelForButton.setLayout(ExperimentLayout);
        try {
            //создаем кнопки в цикле
           for (int i = 0; i < rows * columns; i++) {
          //     for (int i = 0; i < rows; i++) {
                JButton q = new JButton();
                    q.setPreferredSize(new Dimension(30, 30));
                //метод задает цвет кнопки
                q.setBackground(Color.WHITE);
                //метод задает цвет при нажатии
   //             q.setForeground(Color.WHITE);
                //TODO хотела задать размер кнопок и положение в центре, но эти два метода фактически не работают
                //TODO  q.setPreferredSize(new Dimension(30, 30));
                //TODO q.setHorizontalAlignment(JLabel.CENTER);
                //добавляем кнопки на панель

                    panelForButton.add(q);
            }

//ловим исключение
        } catch (Exception e2) {
            JOptionPane.showMessageDialog(null, e2);
        }
//создаем скроллпанель, добавляем панель в скроллпанель
        JScrollPane ffieldScrollPane = new JScrollPane(panelForButton);


        //добавляем горизонтальный разделитель на панели
        ssplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, ffieldScrollPane,
                listScrollPane);
        //TODO не понимаю на что влияет этот метод, изначально стоял true
        ssplitPane.setOneTouchExpandable(false);
        // устанавливаем количество пикселей в панеле поля для рисования,
        // после указанного количества помещается разделитель
        ssplitPane.setDividerLocation(splitPaneX);


        //Определяем и устанавливаем минимальное значение для обоих скроллпанелей в разделенной панели
        // меньше чем этот размер разделительный бигунок двигать нельзя
            if (pX<=25){
        Dimension minimumSize = new Dimension(900, 500);
                listScrollPane.setPreferredSize(new Dimension(900, 500));
        listScrollPane.setMinimumSize(minimumSize);
        ffieldScrollPane.setMinimumSize(new Dimension(pX, pY));
        ffieldScrollPane.setMaximumSize(new Dimension(pX+1, pY+1));
        //Устанавливаем минимальный размер разделенной панели
        ssplitPane.setPreferredSize(new Dimension(1100, 500));}
            else {
              //  Dimension minimumSize = new Dimension(200, 500);
                listScrollPane.setMinimumSize(new Dimension(200,500));
                ffieldScrollPane.setMaximumSize(new Dimension(800, 500));
             //   fieldScrollPane.setMinimumSize(minimumSize);
              ssplitPane.setPreferredSize(new Dimension(1100, 500));
            }

    //    updateLabel(imageNames[list.getSelectedIndex()]);
    }

    //Listens to the list
    @Override
    public void valueChanged(ListSelectionEvent e) {
        JList list = (JList) e.getSource();
      //  updateLabel(imageNames[list.getSelectedIndex()]);
    }

    //Renders the selected image
//    protected void updateLabel(String name) {
//        ImageIcon icon = createImageIcon("images/" + name + ".gif");
//        picture.setIcon(icon);
//        if (icon != null) {
//            picture.setText(null);
//        } else {
//            picture.setText("Image not found");
//        }
//    }

    //Used by SplitPaneDemo2
    public JList getImageList() {
        return list;
    }

    public JSplitPane getSplitPane() {
        return ssplitPane;
    }


    /**
     * Returns an ImageIcon, or null if the path was invalid.
     */
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = SplitPane.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
//        public static void createAndShowGUI() {
//
//            //Create and set up the window.
//            JFrame frame = new JFrame("Вяжем с Леной");
//            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            SplitPane splitPaneDemo = new SplitPane();
//            frame.getContentPane().add(splitPaneDemo.getSplitPane());
//
//
//            frame.pack();
//            frame.setVisible(true);
//        }
//
//        public static void main(String[] args) {
//            //Schedule a job for the event-dispatching thread:
//            //creating and showing this application's GUI.
//            javax.swing.SwingUtilities.invokeLater(new Runnable() {
//                public void run() {
//                    createAndShowGUI();
//                }
//            });
    //       }
}
