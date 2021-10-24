package javaForChildren.Grafica;

import javax.swing.*;
import java.awt.*;
/**
 * page 85
 */

/**
Swingпредоставляет    следующие    схемы:

        •FlowLayout
        •GridLayout
        •BoxLayout
        •BorderLayout
        •CardLayout
        •GridBagLayout
*/

public class SimpleCalculator {
    public static void main(String[] args) {

        // Create a panel
        // Создаём панель
        JPanel windowContent = new JPanel();

        // Set the display manager for this panel
        // Задаём менеджер отображения для это йпанел
        /**


         FlowLayout fl = new FlowLayout();
         this.setLayoutManager(fl); //not working this

         GridLayout gr= new GridLayout(4,2,5,5);
         windowContent.setLayout(gr);


         BorderLayout bl = new BorderLayout();
         this.setLayoutManager(bl);

         JTextField  txtDisplay = new JTextField(20);
         this.add("North",   txtDisplay);
         */

        FlowLayout fl = new FlowLayout();
        windowContent.setLayout(fl);

        // Создаём компоненты в памяти
        //creating components in memory
        JLabel label1 = new JLabel("Number 1:");
        JTextField field1 = new JTextField(10);
        JLabel label2 = new JLabel("Number 2:");
        JTextField field2 = new JTextField(10);
        JLabel label3 = new JLabel("Sum:");
        JTextField result = new JTextField(10);
        JButton go = new JButton("Add");

        //add components on a panel
        windowContent.add(label1);
        windowContent.add(field1);
        windowContent.add(label2);
        windowContent.add(field2);
        windowContent.add(label3);
        windowContent.add(result);
        windowContent.add(go);

        //create a frame and set the panel for it
        JFrame frame = new JFrame("My First Calculator");
        frame.setContentPane(windowContent);

        // set the size and set panel visible.
        frame.setSize(400,100);
        frame.setVisible(true);


    }
}
