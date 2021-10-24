package javaForChildren.Grafica;

import javax.swing.*;
import java.awt.*;

public class TEst {
    public static void main(String[] args) {

/**
 * page 85
 */
        // Create a panel
        // Создаём панель
        JPanel windowContent = new JPanel();

        // Set the display manager for this panel
        // Задаём менеджер отображения для это йпанел


        FlowLayout fl = new FlowLayout();
        windowContent.setLayout(fl);

        // Создаём компоненты в памяти
        //creating components in memory
        JLabel label1 = new JLabel("Number 1:");
        JTextField field1 = new JTextField(5);
        JButton go = new JButton("Add");

        //add components on a panel
        windowContent.add(label1);
        windowContent.add(field1);
        windowContent.add(go);

        //create a frame and set the panel for it
        JFrame frame = new JFrame("My First Calculator");
        frame.setContentPane(windowContent);

        // set the size and set panel visible.
        frame.setSize(300,80);
        frame.setVisible(true);


    }
}
