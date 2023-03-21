package org.example;

import javax.swing.*;
import java.awt.*;

public class InputDialogInFrame extends JFrame {
    private static char[] result;

    public InputDialogInFrame() {

        getContentPane().setBackground(Color.DARK_GRAY);
        Image img = new ImageIcon("C:/Users/aagureeva/IdeaProjects/Knitting/src/main/java/нитки.gif").getImage();
        setIconImage(img);
        setTitle("Вяжем с Леной");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setSize(400, 300);
        getContentPane().setLayout(null);
        setLocationRelativeTo(null);

    }

    public static char[] getResult() {
        return result;
    }

    void closeIt() {

        this.getContentPane().setVisible(false);
        this.dispose();

    }

    public static int isInputNumber(String inputString, InputDialogInFrame frame) {
        int numberInt=0;
        int minNumber= 10;
        result = inputString.toCharArray();

        for (int i = 0; i < getResult().length; ++i) {
            if (Character.isDigit(getResult()[i])) {
                numberInt = Integer.parseInt(inputString);
            }

        } if (numberInt>0) {return numberInt;}
        else {return minNumber;}

        }
     }

