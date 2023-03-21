package org.example;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
//
//public class LoopsPanel extends JFrame {
//
//        public LoopsPanel() {
//            super("Test frame");
//            createGUI();
//        }
//
//    final static ImageIcon licevaaLoops = new ImageIcon("C:/Users/aagureeva/IdeaProjects/Knitting/src/main/java/loops/лицевая петля.gif");
//    final static ImageIcon iznanochnaaLoops = new ImageIcon("C:/Users/aagureeva/IdeaProjects/Knitting/src/main/java/loops/лицевая петля.gif");
//    final static ImageIcon nacid = new ImageIcon("C:/Users/aagureeva/IdeaProjects/Knitting/src/main/java/loops/накид.gif");
//
//    private String[] imageNames = {"петля", "изнаночная петля", "накид", "столбик с накидом"};
//
//    JLabel loop1=new JLabel ("петля" , new ImageIcon(licevaaLoops.getImage()), SwingConstants.RIGHT);
//    JLabel loop2=new JLabel("изнаночная петля",new ImageIcon(iznanochnaaLoops.getImage()), SwingConstants.RIGHT);
//    JLabel loop3=new JLabel("накид", new ImageIcon (nacid.getImage()), SwingConstants.RIGHT);
//
//
//        public void createGUI() {
//            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//            JPanel panel = new JPanel();
//            panel.setLayout(new BorderLayout());
//
//            final JList list = new JList(imageNames);
//
//            list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//
//            list.setCellRenderer(new DefaultListCellRenderer() {
//                public Component getListCellRendererComponent(JList list,
//                                                              Object value, int index, boolean isSelected,
//                                                              boolean cellHasFocus) {
//                    Component component = super.getListCellRendererComponent(list,
//                            value, index, isSelected, cellHasFocus);
//                    JLabel label = (JLabel) component;
//                    Icon icon = UIManager.getIcon("Tree.closedIcon");
//                    label.setIcon(icon);
//                    return label;
//                }
//            });
//
//            panel.add(new JScrollPane(list), BorderLayout.CENTER);
//
//           getContentPane().add(panel);
//
//            setPreferredSize(new Dimension(250, 200));
//        }
//
//
//    }
