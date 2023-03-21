package Del;

import javax.swing.*;
import java.awt.*;

public class Field extends JFrame {
    private static JPanel panel;
    //private static ScrollPane panel;
    protected static int rows;
    protected static int columns;
    private static char EMPTY = 8210;//'-'; //8213
    private static char [][] field; //= new char[coordinatesY][coordinatesX];

    private static Toolkit kit = Toolkit.getDefaultToolkit();//получить размер экрана
    // конкретного устройства, метод возвращает объект типа Toolkit
    private static Dimension screenSize = kit.getScreenSize();//метод возвращает ширину и
    // высоту экрана в открытых переменных

    private int screenHeight = screenSize.height;   //сохраняем высоту экрана
    private int screenWidth = screenSize.width; //сохраняем ширину экрана

    private static int screenHeightMinus25 = screenSize.height * 75 / 100;//сохраняем высоту frame в переменной
    private static int screenWidthMinus25 = screenSize.width * 75 / 100;//сохраняем ширину frame в переменной

    public Field(int rows, int columns) {

        this.rows = rows;
        this.columns = columns;
        this.field = new char [rows][columns];


        setTitle("Вяжем с Леной");
       // setResizable(true);
        Image img = new ImageIcon("C:/Users/aagureeva/IdeaProjects/Knitting/src/main/java/нитки.gif").getImage();
        setIconImage(img);
       setSize(screenWidthMinus25, screenHeightMinus25);
       // setLocationRelativeTo(null);
        JButton exitButton = new JButton("Выход");
        JButton saveButton = new JButton("Сохранить");
        JButton openButton = new JButton("Загрузить");
        JPanel panel = new JPanel();
        //panel = new ScrollPane();
   //     panel.setBorder(BorderFactory.createLineBorder(Color.black));
        panel.add(openButton);
        panel.add(saveButton);
       panel.add(exitButton);

        saveButton .addActionListener(event->System.exit(0));
                openButton.addActionListener(event->System.exit(0));
        exitButton.addActionListener(event->System.exit(0));



        //JScrollPane scrollPane = new JScrollPane(panel);
        //add(scrollPane, BorderLayout.CENTER);
        add(panel);
    }

    public static JPanel getPanel() {
    //public static ScrollPane getPanel() {
        return panel;
        //return null;
    }

    public void setPanel(JPanel buttonPanel) {
        this.panel = buttonPanel;
    }

    public static char [][] getField() {
        return field;
    }

    public static int getRows() {
        return rows;
    }

    public static int getColumns() {
        return columns;
    }

    public static void setColumns(int columns) {
        if (columns> 0 && columns<=300) {
        Field.columns = columns;}
        else {
            System.out.println("Ошибка в указании количества колонок. Максимально допустимое значение 300.");
        }
    }

    public static void setRows(int rows) {
        if (rows> 0 && rows<=300) {
        Field.rows = rows;}
        else{
            System.out.println("Ошибка в указании количества рядов. Максимально допустимое значение 300.");
        }
    }

//    public static void createField(char[][] field) {
//        field = new char[rows][columns];
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                field[i][j] = EMPTY;
//            }
//        }
//        Field.field = field;
//    }

    public static void printField(char[][] field) {
        int numberRow = 1;
        for (char[] row : field) {
            System.out.print(numberRow);
            System.out.println(row);
            numberRow++;
        }
    }

    public void paint(Graphics g) {
        int y = 100;
        g.setColor(new Color(29, 13, 123));
        for (int i = 0; i < rows; i++) {

            int x = 80;
            for (int j = 0; j < columns; j++) {


                g.drawRect(x, y, 30, 30);

                x += 30;
            }
            y += 30;
        }
    }
}


