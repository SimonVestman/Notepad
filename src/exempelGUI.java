import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class exempelGUI {
    static int WIDTH = 800;
    static int HEIGHT = 800;
    static JFrame frame;
    static JPanel panel;
    static JTextArea text;
    static JButton button;
    static JMenuBar menuBar;
    static JMenu menu;
    static JMenuItem menuItem;

    public static void main (String[]args){
        frame = new JFrame ("Exempel");
        panel = new JPanel();
        text = new JTextArea(20,20);
        button = new JButton("Clear");

        menuBar = new JMenuBar();
        menu =  new JMenu("Stuff");
        menuItem = new JMenuItem("HEj222");
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                text.append("HEj222");
            }
        });

        menuBar.add(menu);
        menu.add(menuItem);
        frame.setJMenuBar(menuBar);

        frame.add(panel);
        panel.add(text);
        panel.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                text.setText("");
            }
        });

        Dimension dim = new Dimension(WIDTH,HEIGHT);
        frame.setPreferredSize(dim);
        frame.pack();
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}
