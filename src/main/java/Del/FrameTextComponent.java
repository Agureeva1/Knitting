package Del;

import javax.swing.*;
import java.awt.*;

public class FrameTextComponent extends JComponent {

        public void paintComponent(Graphics g) {//переопределяем метод для рисования компонентов
            var g2 = (Graphics2D) g;
            g.setColor(new Color(23, 13, 167));

            var sansSerifPLAIN = new Font("SansSerif",Font.PLAIN,36);
            g2.setFont(sansSerifPLAIN);
            g.drawString("ПРИВЕТ", 100, 100);//в параметрах метода передаем объект для отрисовки и его координаты

            var serifPLAIN = new Font("Serif",Font.PLAIN,36);
            g2.setFont(serifPLAIN);
            g.drawString("Hello", 100, 200);

            var mnospacedPLAIN = new Font("Monospaced",Font.PLAIN,36);
            g2.setFont(mnospacedPLAIN);
            g.drawString("Здорово", 100, 300);

            var dialogPLAIN = new Font("Dialog",Font.PLAIN,36);
            g2.setFont(dialogPLAIN);
            g.drawString("Хаюшки", 100, 400);

            var dialogInputPLAIN = new Font("DialogInput",Font.PLAIN,36);
            g2.setFont(dialogInputPLAIN);
            g.drawString("Кукусики", 100, 500);

            Image image = new ImageIcon("C:/Users/aagureeva/IdeaProjects/Knitting/src/main/java/Icon.gif").getImage();
            g.drawImage(image,300,30,null);
        }

  public Dimension getPreferredSize(){
        return new Dimension(90,40);
   }

   //названия шрифтов, всегда приводящиеся к шрифтам,
   // фактически существующим на компьютере,
    // SansSerif
  //  Serif
  // Monospaced
   // Dialog
   // DialogInput

    //Стиль шрифта

    //Font.PLAIN - обычный
    //Font.BOLD - жирный
    //FONT.ITALIC - курсив
    //Font.BOLD + FONT.ITALIC

    }

