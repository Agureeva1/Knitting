package org.example;

import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args) throws Exception {
        EventQueue.invokeLater(() -> {

            InputDialogInFrame frameRow = new InputDialogInFrame();
            String numberRow = JOptionPane.showInputDialog(frameRow, "Укажите количество строк поля","Вяжем с Леной",
                   JOptionPane.INFORMATION_MESSAGE);
            int numberRowInt = InputDialogInFrame.isInputNumber(numberRow,frameRow);
            frameRow.closeIt();

                InputDialogInFrame frameColumn = new InputDialogInFrame();
        String numberColumn = JOptionPane.showInputDialog(frameRow, "Укажите количество колонок поля","Вяжем с Леной", JOptionPane.INFORMATION_MESSAGE);
            int numberColumnInt = InputDialogInFrame.isInputNumber(numberColumn,frameColumn);
           frameColumn.closeIt();

    //       JFrame.setDefaultLookAndFeelDecorated(true);
//           LoopsPanel frame = new LoopsPanel();

            JFrame frame = new JFrame("Вяжем с Леной");
           Image img = new ImageIcon("C:/Users/aagureeva/IdeaProjects/Knitting/src/main/java/нитки.gif").getImage();
            frame.setIconImage(img);
           SplitScrollPanel splitPane = new SplitScrollPanel(numberRowInt,numberColumnInt);
           frame.getContentPane().add(splitPane.getSplitPane());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//


            frame.pack();
            frame.setVisible(true);
         });
    }}


